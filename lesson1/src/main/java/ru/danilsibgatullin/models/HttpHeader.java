package ru.danilsibgatullin.models;

public class HttpHeader {

    private String server;
    private String responseCode;
    private String contentType;

    private HttpHeader(){}

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private HttpHeader httpHeader;

        private Builder(){
            httpHeader = new HttpHeader();
        }

        public Builder withServer(String param){
            this.httpHeader.server=param;
            return this;
        }

        public Builder withResponseCode(String param){
            this.httpHeader.responseCode=param;
            return this;
        }

        public Builder withContentType(String param){
            this.httpHeader.contentType =param;
            return this;
        }

        public HttpHeader build(){
            return this.httpHeader;
        }
    }

    @Override
    public String toString() {
        return responseCode + '\n'
                + contentType + '\n'
                +'\n';
    }
}
