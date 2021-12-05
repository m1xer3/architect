package ru.danilsibgatullin.implementations;

import ru.danilsibgatullin.interfaces.FileOperationService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileOperationImp implements FileOperationService {

    @Override
    public List<Path> findPaths(String directory, List<String> fileName) {
        return fileName
                .stream()
                .map(name ->Paths.get(directory, name))
                .filter(path -> path.toFile().isFile())
                .collect(Collectors.toList());
    }

}
