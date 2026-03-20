package com.event;

public class Main {
    public static void main(String[] args) {

        Event event = new Event(1, "Tech Talk", "20 March", "University");

        Participant p1 = new Participant(101, "Piyush", "piyush@email.com");
        Participant p2 = new Participant(102, "Rahul", "rahul@email.com");

        p1.registerEvent(event);
        p2.registerEvent(event);

        p1.submitFeedback(event, 5, "Excellent event!");
        p2.submitFeedback(event, 4, "Very good!");

        System.out.println("Average Rating: " + event.calcAvgRating());
    }
}