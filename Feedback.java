package com.event;

public class Feedback {
    int rating;
    String comment;
    int participantId;

    public Feedback(int rating, String comment, int participantId) {
        this.rating = rating;
        this.comment = comment;
        this.participantId = participantId;
    }
}