package ru.danilsibgatullin.implementations;

import ru.danilsibgatullin.interfaces.SendService;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class SendServiceImp implements SendService {

    @Override
    public void sendToClientNoFileFound(OutputStream outputStream) {
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println("HTTP/1.1 404 NOT_FOUND");
        printWriter.println("Content-Type: text/html; charset=utf-8");
        printWriter.println();
        printWriter.println("<h1>Файл не найден!</h1>");
        printWriter.flush();
    }

    @Override
    public void sendToClientFile(List<Path> paths,OutputStream outputStream){
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println("HTTP/1.1 200 OK");
        printWriter.println("Content-Type: text/html; charset=utf-8");
        printWriter.println();
        printWriter.println("File find");
            paths.stream().forEach(path ->{
                try {
                    if(Files.isReadable(path)){
                    Files.newBufferedReader(path).lines().forEach(printWriter::println);}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        printWriter.flush();
    }

}
