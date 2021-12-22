package ru.danilsibgatyllin.bridge;

public class DrowPage {
    public static void main(String[] args) {
        Theme lightTheme = new LightTheme();
        Theme darkTheme = new DarkTheme();
        WebPage aboutLight = new About(lightTheme);
        WebPage aboutDark = new About(darkTheme);

        aboutLight.getContent();
        aboutDark.getContent();

    }
}
