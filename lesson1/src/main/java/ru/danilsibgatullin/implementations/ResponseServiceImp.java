package ru.danilsibgatullin.implementations;

import ru.danilsibgatullin.interfaces.ResponseService;
import ru.danilsibgatullin.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ResponseServiceImp implements ResponseService {

    private StringBuilder response;

    public ResponseServiceImp() {
        this.response = new StringBuilder();
    }

    @Override
    public HttpResponse prepearResponse(HttpRequest httpRequest) throws IOException {

        if (httpRequest.getMethod().equals("GET")) {
            Path path = Paths.get(ConfigServer.WWW, httpRequest.getUrl());

            if (!Files.exists(path)) {
                return HttpResponse.getBuilder()
                        .withHeader(HttpHeader.getBuilder()
                                .withResponseCode(ResponseCode.getResponseDescriptionHTTP(404))
                                .withServer(ConfigServer.SERVERNAME)
                                .withContentType("Content-Type: text/html; charset=utf-8")
                                .build())
                        .withBody("<h1>FILE NOT FOUND!</h1>")
                        .build();
            }


            Files.readAllLines(path).forEach(response::append);
            return HttpResponse.getBuilder()
                    .withHeader(HttpHeader.getBuilder()
                            .withResponseCode(ResponseCode.getResponseDescriptionHTTP(200))
                            .withServer(ConfigServer.SERVERNAME)
                            .withContentType("Content-Type: text/html; charset=utf-8")
                            .build())
                    .withBody(response.toString())
                    .build();
        }
        else{
            return HttpResponse.getBuilder()
                    .withHeader(HttpHeader.getBuilder()
                            .withResponseCode(ResponseCode.getResponseDescriptionHTTP(405))
                            .withServer(ConfigServer.SERVERNAME)
                            .withContentType("Content-Type: text/html; charset=utf-8")
                            .build())
                    .withBody("<h1>METHOD NOT ALLOWED!</h1>")
                    .build();
        }
    }


}
