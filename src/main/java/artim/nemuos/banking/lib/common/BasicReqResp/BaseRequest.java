package artim.nemuos.banking.lib.common.BasicReqResp;

import java.util.HashMap;

public class BaseRequest {
    private String webAddress;
    private String urlPath;
    private HashMap<String, String> header;
    private HashMap<String, String> parameters;
    private String plainBody;
    private HashMap<String, String> paramBody;
    private HashMap<String, String> queryParams;

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public HashMap<String, String> getHeader() {
        return header;
    }

    public void setHeader(HashMap<String, String> header) {
        this.header = header;
    }

    public HashMap<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getPlainBody() {
        return plainBody;
    }

    public void setPlainBody(String plainBody) {
        this.plainBody = plainBody;
    }

    public HashMap<String, String> getParamBody() {
        return paramBody;
    }

    public void setParamBody(HashMap<String, String> paramBody) {
        this.paramBody = paramBody;
    }

    public HashMap<String, String> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(HashMap<String, String> queryParams) {
        this.queryParams = queryParams;
    }

    public BaseRequest(String webAddress, String urlPath, HashMap<String, String> header, HashMap<String, String> parameters, String plainBody, HashMap<String, String> paramBody, HashMap<String, String> queryParams) {
        this.webAddress = webAddress;
        this.urlPath = urlPath;
        this.header = header;
        this.parameters = parameters;
        this.plainBody = plainBody;
        this.paramBody = paramBody;
        this.queryParams = queryParams;
    }

    public BaseRequest() {
    }
}
