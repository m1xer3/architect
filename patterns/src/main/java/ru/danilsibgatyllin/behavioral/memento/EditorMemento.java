package ru.danilsibgatyllin.behavioral.memento;

public class EditorMemento {

    protected String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
