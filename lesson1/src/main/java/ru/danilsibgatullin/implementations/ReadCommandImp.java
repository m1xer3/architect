package ru.danilsibgatullin.implementations;

import ru.danilsibgatullin.interfaces.ReadComandService;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadCommandImp implements ReadComandService {

    @Override
    public List<String> readCommand(InputStream inputStream) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(
                        inputStream, StandardCharsets.UTF_8));
        String firstLine = input.readLine();
        return Arrays.stream(firstLine.split(" ")).collect(Collectors.toList());

    }

}
