package ru.danilsibgatyllin.bridge;

public class Careers extends WebPage {
    private Theme theme;

    public Careers(Theme theme) {
        super(theme);
        this.theme=theme;
    }

    @Override
    public void getContent() {
        System.out.println("Careers page with theme "+this.theme.getColor());
    }
}
