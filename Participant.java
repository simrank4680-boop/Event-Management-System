package com.event;

public class Participant {
    int id;
    String name;
    String email;

    public Participant(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    void registerEvent(Event e) {
        e.addParticipant(this);
    }

    void submitFeedback(Event e, int rating, String comment) {
        Feedback f = new Feedback(rating, comment, this.id);
        e.addFeedback(f);
    }
}