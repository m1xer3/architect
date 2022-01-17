package ru.danilsibgatyllin.behavioral.state;

public class TextEditor {

    private WritingState writingState;

    public TextEditor(WritingState writingState) {
        this.writingState = writingState;
    }

    public void setWritingState(WritingState writingState) {
        this.writingState = writingState;
    }

    public void type(String words){
        this.writingState.write(words);
    }
}
