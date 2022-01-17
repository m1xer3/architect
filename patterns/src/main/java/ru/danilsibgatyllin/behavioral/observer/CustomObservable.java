package ru.danilsibgatyllin.behavioral.observer;

public interface CustomObservable {

    void notify(JobPost jobPost);
    void attach(CustomObserver customObserver);
    void addJob(JobPost jobPost);
}
