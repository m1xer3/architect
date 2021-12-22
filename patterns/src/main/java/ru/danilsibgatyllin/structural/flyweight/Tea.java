package ru.danilsibgatyllin.structural.flyweight;

public class Tea {
    private String teeName;

    public Tea(String name) {
        this.teeName=name;
    }

    public String getTeeName() {
        return teeName;
    }

    public void setTeeName(String teeName) {
        this.teeName = teeName;
    }

}
