package com.task4.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Agency implements InfoChannel {

    @Override
    public void update(Message message) {
        System.out.println(message.toString());
    }
}
