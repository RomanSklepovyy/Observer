package com.task4.observer;

import java.time.LocalDateTime;
import java.util.Date;

public class Message {

    private String text;
    private String timeCreated;

    public Message(String text) {
        this.text = text;
        this.timeCreated = LocalDateTime.now().toString();
    }
}
