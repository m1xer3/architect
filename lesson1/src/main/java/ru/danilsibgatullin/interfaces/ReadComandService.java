package ru.danilsibgatullin.interfaces;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface ReadComandService {

    List<String> readCommand(InputStream inputStream) throws IOException;

}
