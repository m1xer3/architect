package ru.danilsibgatullin.models;

import lombok.Data;

@Data
public class HttpRequest {

    private String method;

    private String url;

    private HttpHeader headers;

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    private String body;

    private HttpRequest(){}

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private final HttpRequest httpRequest ;

        Builder(){
            this.httpRequest = new HttpRequest();
        }

        public Builder withMethod(String param){
            this.httpRequest.method=param;
            return this;
        }

        public Builder withUrl(String param){
            this.httpRequest.url=param;
            return this;
        }

        public Builder withHeaders(HttpHeader param){
            this.httpRequest.headers=param;;
            return this;
        }

        public Builder withBody(String param){
            this.httpRequest.body=param;
            return this;
        }

        public HttpRequest build(){
            return this.httpRequest;
        }
    }
}
