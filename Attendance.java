package com.event;

public class Attendance {
    Participant participant;
    Event event;
    boolean status;

    public Attendance(Participant participant, Event event) {
        this.participant = participant;
        this.event = event;
        this.status = false;
    }

    void markPresent() {
        status = true;
    }
}