package ru.danilsibgatyllin.bridge;

public class About extends WebPage {

    private Theme theme;

    public About(Theme theme) {
        super(theme);
        this.theme=theme;
    }

    @Override
    public void getContent() {
        System.out.println("About with theme "+ this.theme.getColor());
    }
}
