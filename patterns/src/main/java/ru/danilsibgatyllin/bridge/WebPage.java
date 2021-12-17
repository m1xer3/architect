package ru.danilsibgatyllin.bridge;

public class WebPage implements WebAction{

    private Theme theme;

    WebPage(Theme theme){
        this.theme=theme;
    }

    @Override
    public void getContent() {
        System.out.println("Some content with theme " + this.theme.getColor());

    }
}
