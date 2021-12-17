package ru.danilsibgatullin.models;

public class ResponseCode {

    private final static String PROTOCOL_HTTP = "HTTP/1.1";

    public static String getResponseDescriptionHTTP(Integer code){
        String description;
        switch (code){
            case (200):{
                description="ОК";
                break;
            }
            case (404):{
                description="NOT_FOUND";
                break;
            }
            case (405):{
                description="METHOD_NOT_ALLOWED";
                break;
            }
            default: throw new IllegalArgumentException("No such code response");
        }
        StringBuilder header = new StringBuilder();
        header.append(PROTOCOL_HTTP);
        header.append(" ");
        header.append(code);
        header.append(" ");
        header.append(description);
        header.append("\n");
        return header.toString();
    }
}
