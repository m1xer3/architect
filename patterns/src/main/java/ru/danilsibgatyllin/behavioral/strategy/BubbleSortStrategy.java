package ru.danilsibgatyllin.behavioral.strategy;

import java.util.List;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> dataSet) {
        System.out.println("Sorting using bubble sort");
        return dataSet;
    }
}
