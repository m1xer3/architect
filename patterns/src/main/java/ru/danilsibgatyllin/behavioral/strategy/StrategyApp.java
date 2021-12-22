package ru.danilsibgatyllin.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyApp {

    public static void main(String[] args) {
        List<Integer> dataSet = new ArrayList<>();
        dataSet.add(1);
        dataSet.add(5);
        dataSet.add(6);
        dataSet.add(3);

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(dataSet);
        sorter = new Sorter(new QuickSortStrategy());
        sorter.sort(dataSet);
    }
}
