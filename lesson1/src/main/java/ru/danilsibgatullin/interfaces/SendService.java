package ru.danilsibgatullin.interfaces;


import java.io.OutputStream;
import java.nio.file.Path;
import java.util.List;

public interface SendService {

   void sendToClientNoFileFound(OutputStream outputStream);

   void sendToClientFile(List<Path> paths,OutputStream outputStream);

}
