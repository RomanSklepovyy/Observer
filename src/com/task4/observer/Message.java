package com.task4.observer;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;

public class Message {

    private String text;
    private String timeCreated;

    public String getText() {
        return text;
    }

    public Message(String text) {

        SimpleDateFormat dateFormat = new SimpleDateFormat();
        this.text = text;
        this.timeCreated = dateFormat.format(new Date());
    }

    @Override
    public String toString() {
        return text + " at " + timeCreated;
    }
}
