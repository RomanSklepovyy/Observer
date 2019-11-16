package com.task4.observer;

import java.util.Observable;
import java.util.Observer;

public class Agent implements InfoChannel {

    private String codeName;
    private InfoChannel infoChannel;
    private boolean isExposed = false;

    public Agent(String codeName, InfoChannel infoChannel) {

        this.codeName = codeName;
        this.infoChannel = infoChannel;
    }
    

    @Override
    public void update(Message message) {
        infoChannel.update(new Message(codeName + " : " + message.getText()));
    }

}
