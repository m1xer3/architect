package ru.danilsibgatullin;

import ru.danilsibgatullin.handler.ClientHandler;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    private static String WWW = "/home/m1xer/temp";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started!");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected!");

                new Thread(() -> new ClientHandler(socket,WWW).processing()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}