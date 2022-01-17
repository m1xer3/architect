package ru.danilsibgatyllin.behavioral.observer;

public class JobSeeker implements CustomObserver {

    String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void onJobPosted(JobPost job){
        System.out.println("Hi "+this.name+"! New job posted: "+job.getTitle());
    }


}
