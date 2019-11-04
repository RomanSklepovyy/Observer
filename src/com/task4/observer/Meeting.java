package com.task4.observer;
import java.util.ArrayList;

public class Meeting {

    private String startTime;
    private String endTime;
    private String waysOfextension;
    private String sourceOfIncome;
    private String launderingMethods;
    ArrayList<Agent> agents;

    public void registration(Agent agent) {
        agents.add(agent);
    }

}
