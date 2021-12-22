package ru.danilsibgatyllin.behavioral.templatemethod;

public class TemplateApp {
    public static void main(String[] args) {
        Builder androidBuilder = new AndroidBuilder();
        androidBuilder.build();
        Builder iosBuilder = new IosBuilder();
        iosBuilder.build();
    }
}
