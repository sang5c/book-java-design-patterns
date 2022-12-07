package com.example.javadesignpatterns.example._05_singleton.Q1;

public class TicketMaker {
    private int ticket = 1000;

    public static TicketMaker getInstance() {
        return null;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
