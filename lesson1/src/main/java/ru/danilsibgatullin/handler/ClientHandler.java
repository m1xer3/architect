package ru.danilsibgatullin.handler;

import ru.danilsibgatullin.implementations.FileOperationImp;
import ru.danilsibgatullin.implementations.ReadCommandImp;
import ru.danilsibgatullin.implementations.SendServiceImp;
import ru.danilsibgatullin.interfaces.FileOperationService;
import ru.danilsibgatullin.interfaces.ReadComandService;
import ru.danilsibgatullin.interfaces.SendService;

import java.io.*;
import java.net.Socket;
import java.nio.file.Path;
import java.util.List;

public class ClientHandler {

    private Socket clientSocket;
    private FileOperationService findFileService;
    private SendService sendService;
    private ReadComandService readComandService;
    private String directory;
    private OutputStream outputStream;
    private InputStream inputStream;

    public ClientHandler(Socket clientSocket,String directory){
        this.clientSocket=clientSocket;
        this.directory = directory;
    }

    public void processing(){

        try {

            //Инициализация
            findFileService=new FileOperationImp();
            inputStream =  clientSocket.getInputStream();
            outputStream = clientSocket.getOutputStream();
            readComandService = new ReadCommandImp();
            sendService=new SendServiceImp();

            //Цикл обработки
            while (clientSocket.isConnected()) {
                List<Path> outPath = findFileService.findPaths(directory, readComandService.readCommand(inputStream)); // получает пути к файлам которые существуют
                if (outPath.isEmpty()) {
                    sendService.sendToClientNoFileFound(outputStream); //если файл не найден отправляем информацию об этом
                }else {
                sendService.sendToClientFile(outPath, outputStream); //отправляем содержимое файлов
                }
            }
        } catch (IOException io){
            io.printStackTrace();
        }
    }


}
