package artim.nemuos.banking.lib.common.BasicReqResp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.util.HashMap;

public class BaseResponse {
    HashMap<String, String> responseHeaders, cookies;
    int statusCode;
    Object responseBody;

    public HashMap<String, String> getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(HashMap<String, String> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public HashMap<String, String> getCookies() {
        return cookies;
    }

    public void setCookies(HashMap<String, String> cookies) {
        this.cookies = cookies;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(Object responseBody) {
        this.responseBody = responseBody;
    }

    public BaseResponse(HashMap<String, String> responseHeaders, HashMap<String, String> cookies, int statusCode, Object responseBody) {
        this.responseHeaders = responseHeaders;
        this.cookies = cookies;
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }
    public BaseResponse()
    {

    }
    public BaseResponse(Mono<ResponseEntity<String>> response) throws JsonProcessingException {
        response.map(entity -> {
            entity.getHeaders().forEach((k,  v ) -> this.responseHeaders.put(k,String.join(",",v)));
            this.responseBody = entity.getBody();
            this.statusCode = entity.getStatusCode().value();
            return null;
        });
    }
}
