package ru.danilsibgatullin.models;

public class HttpResponse {

    private HttpHeader header;

    private String body;

    private HttpResponse() {
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private HttpResponse httpResponse;

        private Builder(){
            httpResponse = new HttpResponse();
        }

        public Builder withHeader(HttpHeader param){
            this.httpResponse.header=param;
            return this;
        }

        public Builder withBody(String param){
            this.httpResponse.body=param;
            return this;
        }

        public HttpResponse build(){
            return this.httpResponse;
        }

    }

    @Override
    public String toString() {
        return this.header.toString()
                +body;
    }
}
