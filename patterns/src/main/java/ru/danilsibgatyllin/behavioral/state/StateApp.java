package ru.danilsibgatyllin.behavioral.state;

public class StateApp {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new DefaultText());
        editor.type("First line");
        editor.setWritingState(new UpperCase());
        editor.type("Second line");
        editor.type("Third line");
        editor.setWritingState(new LowerCase());
        editor.type("Fourth line");
        editor.type("Fifth line");
    }
}
