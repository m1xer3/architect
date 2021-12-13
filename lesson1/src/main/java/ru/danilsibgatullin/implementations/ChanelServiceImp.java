package ru.danilsibgatullin.implementations;

import ru.danilsibgatullin.interfaces.ChanelService;
import ru.danilsibgatullin.models.HttpResponse;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Deque;
import java.util.LinkedList;

public class ChanelServiceImp implements ChanelService {

    private final Socket socket;

    public ChanelServiceImp(Socket socket) {
        this.socket = socket;
    }


    @Override
    public Deque<String> readRequest() throws IOException {
        try {
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));

            while (!input.ready());

            Deque<String> request = new LinkedList<>();
            while (input.ready()) {
                String line = input.readLine();
                System.out.println(line);
                request.add(line);
            }
            return request;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void  sendResponse (HttpResponse httpResponse) throws IOException {
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println(httpResponse);
        printWriter.flush();

    }

    @Override
    public void close() throws IOException {
        if (!socket.isClosed()) {
            socket.close();
        }
    }
}
