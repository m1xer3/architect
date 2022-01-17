package ru.danilsibgatyllin.behavioral.state;

public class UpperCase implements WritingState {
    @Override
    public void write(String words) {
        System.out.println(words.toUpperCase());
    }
}
