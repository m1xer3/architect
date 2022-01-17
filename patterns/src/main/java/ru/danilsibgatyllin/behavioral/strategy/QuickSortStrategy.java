package ru.danilsibgatyllin.behavioral.strategy;

import java.util.List;

public class QuickSortStrategy implements SortStrategy{
    @Override
    public List<Integer> sort(List<Integer> dataSet) {
        System.out.println("Sorting using quick sort");
        return dataSet;
    }
}
