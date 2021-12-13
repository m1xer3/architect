package ru.danilsibgatullin;

import ru.danilsibgatullin.handler.ClientHandler;
import ru.danilsibgatullin.implementations.ChanelServiceImp;
import ru.danilsibgatullin.implementations.RequestParser;
import ru.danilsibgatullin.models.ConfigServer;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(ConfigServer.PORT)) {
            System.out.println("Server started!");
            RequestParser requestParser = new RequestParser();
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected!");

                new Thread(new ClientHandler(new ChanelServiceImp(socket),requestParser)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}