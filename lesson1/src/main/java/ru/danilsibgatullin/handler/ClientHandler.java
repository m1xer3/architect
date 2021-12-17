package ru.danilsibgatullin.handler;


import ru.danilsibgatullin.implementations.RequestParser;
import ru.danilsibgatullin.implementations.ResponseServiceImp;
import ru.danilsibgatullin.interfaces.ChanelService;


import java.io.*;
import java.util.Deque;

public class ClientHandler implements Runnable {

    private ChanelService chanelService;
    private RequestParser requestParser;


    public ClientHandler(ChanelService chanelService, RequestParser requestParser) {
        this.chanelService = chanelService;
        this.requestParser = requestParser;
    }

    @Override
    public void run() {
        try {
            Deque<String> rawRequest = chanelService.readRequest();
            chanelService.sendResponse(new ResponseServiceImp().prepearResponse(requestParser.parseRequest(rawRequest)));
            try {
                chanelService.close();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Client disconnected!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}