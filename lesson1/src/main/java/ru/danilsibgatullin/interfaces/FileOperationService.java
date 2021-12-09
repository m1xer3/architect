package ru.danilsibgatullin.interfaces;

import java.nio.file.Path;
import java.util.List;

public interface FileOperationService {

    List<Path> findPaths (String directory,List<String> fileName);

}
