package ru.danilsibgatyllin.behavioral.observer;

public class ObserverApp {
    public static void main(String[] args) {
        CustomObserver johnDoe = new JobSeeker("John Doe");
        CustomObserver janeDoe = new JobSeeker("Jane Doe");

        CustomObservable jobPosting = new EmploymentAgency();
        jobPosting.attach(johnDoe);
        jobPosting.attach(janeDoe);

        jobPosting.addJob(new JobPost("Software Engineer"));

    }
}
