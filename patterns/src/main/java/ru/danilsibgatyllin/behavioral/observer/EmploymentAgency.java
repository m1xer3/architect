package ru.danilsibgatyllin.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class EmploymentAgency implements CustomObservable{

    protected List<CustomObserver> observers = new ArrayList<>();

    @Override
    public void notify (JobPost jobPost){
        observers.stream().forEach(thisObserver ->thisObserver.onJobPosted(jobPost));
    }

    @Override
    public void attach(CustomObserver customObserver) {
        this.observers.add(customObserver);
    }

    @Override
    public void addJob(JobPost jobPost) {
        this.notify(jobPost);
    }
}
