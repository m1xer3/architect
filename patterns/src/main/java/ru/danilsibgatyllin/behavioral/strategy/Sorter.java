package ru.danilsibgatyllin.behavioral.strategy;

import java.util.List;

public class Sorter {

    private SortStrategy sorter;

    public Sorter(SortStrategy sorter) {
        this.sorter = sorter;
    }

    public List<Integer> sort(List<Integer> dataSet){
        return this.sorter.sort(dataSet);
    }
}
