package ru.danilsibgatullin.interfaces;

import ru.danilsibgatullin.models.HttpRequest;
import ru.danilsibgatullin.models.HttpResponse;

import java.io.IOException;



public interface ResponseService {

    HttpResponse prepearResponse(HttpRequest httpRequest) throws IOException;

}
