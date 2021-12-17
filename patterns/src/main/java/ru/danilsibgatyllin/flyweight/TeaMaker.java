package ru.danilsibgatyllin.flyweight;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;

public class TeaMaker {
    private Set<Tea> availableTea;

    public TeaMaker() {
        this.availableTea = new HashSet<>();
    }

    public Tea makeTea(String name){
        if(!availableTea.stream().map(tea -> tea.getTeeName()).anyMatch(teaName ->teaName.equals(name)))
            {
                Tea tea = new Tea(name);
                availableTea.add(tea);
                return tea;
            }
        else return availableTea.stream().peek(tea -> tea.getTeeName().equals(name)).findFirst().get();
    }
}
