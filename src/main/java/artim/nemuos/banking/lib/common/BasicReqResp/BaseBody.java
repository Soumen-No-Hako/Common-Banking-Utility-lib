package artim.nemuos.banking.lib.common.BasicReqResp;

import java.util.HashMap;

public class BaseBody {
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

    public BaseBody(HashMap<String, String> responseHeaders, HashMap<String, String> cookies, int statusCode, Object responseBody) {
        this.responseHeaders = responseHeaders;
        this.cookies = cookies;
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }
    public BaseBody()
    {

    }
}
