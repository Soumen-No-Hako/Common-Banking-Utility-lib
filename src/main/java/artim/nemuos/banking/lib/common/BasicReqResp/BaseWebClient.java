package artim.nemuos.banking.lib.common.BasicReqResp;

import artim.nemuos.banking.lib.common.bankingExceptions.request.IncorrectWebAddressException;
import artim.nemuos.banking.lib.common.bankingExceptions.request.InvalidRequestMethodException;
import artim.nemuos.banking.lib.common.bankingExceptions.response.ResponseNotFoundException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.function.Function;

import static artim.nemuos.banking.lib.common.utilities.BankingUtilities.validateWebAddress;

public class BaseWebClient {
    private WebClient webClient;
    public BaseWebClient(String webAddress)
    {
        if(validateWebAddress(webAddress)) webClient = WebClient.builder().baseUrl(webAddress).build();
        else throw new IncorrectWebAddressException(webAddress, "Web Address is not correct format");
    }
    public WebClient.RequestHeadersSpec<?> createRequest(String urlpath, Map<String, String> reqHeaders, Map<String, String> queryParams, Object reqBody, String reqMethod)
    {
        return switch(reqMethod.toUpperCase()){
            case "GET" : yield webClient.get().uri(urlpath).headers(httpHeaders -> reqHeaders.forEach(httpHeaders::add)).attributes(reqQueryParam -> queryParams.forEach(reqQueryParam::put));
            case "POST" : yield webClient.post().uri(urlpath).headers(httpHeaders -> reqHeaders.forEach(httpHeaders::add)).bodyValue(reqBody).attributes(reqQueryParam -> queryParams.forEach(reqQueryParam::put));
            case "PUT" : yield webClient.put().uri(urlpath).headers(httpHeaders -> reqHeaders.forEach(httpHeaders::add)).bodyValue(reqBody).attributes(reqQueryParam -> queryParams.forEach(reqQueryParam::put));
            case "DEL" : yield webClient.delete().uri(urlpath).headers(httpHeaders -> reqHeaders.forEach(httpHeaders::add)).attributes(reqQueryParam -> queryParams.forEach(reqQueryParam::put));
            case "OPT" : yield webClient.options().uri(urlpath).headers(httpHeaders -> reqHeaders.forEach(httpHeaders::add)).attributes(reqQueryParam -> queryParams.forEach(reqQueryParam::put));
            case "PATCH" : yield webClient.patch().uri(urlpath).headers(httpHeaders -> reqHeaders.forEach(httpHeaders::add)).bodyValue(reqBody).attributes(reqQueryParam -> queryParams.forEach(reqQueryParam::put));
            default: throw new InvalidRequestMethodException("request Method has to be between - GET, POST, PUT, PATCH, DEL, OPT");
        };
    }
    public Mono<ResponseEntity<String>> fetchResponse(String urlpath, Map<String, String> reqHeaders, Map<String, String> queryParams, Object reqBody, String reqMethod)
    {
        return createRequest(urlpath, reqHeaders, queryParams, reqBody, reqMethod)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> clientResponse.bodyToMono(String.class).map(msg -> new ResponseNotFoundException("4xx client exception")))
                .onStatus(HttpStatusCode::is5xxServerError, clientResponse -> clientResponse.bodyToMono(String.class).map(msg -> new ResponseNotFoundException("5xx server exception")))
                .toEntity(String.class);
    }
}
