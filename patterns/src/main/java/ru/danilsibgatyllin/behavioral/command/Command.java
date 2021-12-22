package ru.danilsibgatyllin.behavioral.command;

public interface Command {
    void execute();
    void undo();
    void redo();
}
