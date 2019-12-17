package com.company;

public class Situation {
    Situation[] direction;
    String subject, text;
    int dHP, dAP;

    public Situation(String subject, String text, int variants) {
        this.subject = subject;
        this.text = text;

        direction = new Situation[variants];

    }
}