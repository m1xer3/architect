package ru.danilsibgatullin.interfaces;

import ru.danilsibgatullin.models.HttpResponse;

import java.io.IOException;
import java.util.Deque;

public interface ChanelService {

    Deque<String> readRequest() throws IOException;

    void sendResponse(HttpResponse httpResponse) throws IOException;

    void close() throws IOException;
}
