package com.event;

import java.util.ArrayList;

public class Event {
    int eventId;
    String name;
    String date;
    String location;

    ArrayList<Participant> participants = new ArrayList<>();
    ArrayList<Feedback> feedbacks = new ArrayList<>();

    public Event(int eventId, String name, String date, String location) {
        this.eventId = eventId;
        this.name = name;
        this.date = date;
        this.location = location;
    }

    void addParticipant(Participant p) {
        participants.add(p);
        System.out.println("Participant added: " + p.name);
    }

    void addFeedback(Feedback f) {
        feedbacks.add(f);
    }

    double calcAvgRating() {
        if (feedbacks.size() == 0) return 0;

        int total = 0;
        for (Feedback f : feedbacks) {
            total += f.rating;
        }
        return (double) total / feedbacks.size();
    }
}