package com.task4.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Agency agency = new Agency();
        Meeting meeting = new Meeting();
        List<Agent> agents = new ArrayList<>();

        agents.add(new Agent("wolf", agency));
        agents.add(new Agent("rabbit", agency));
        agents.add(new Agent("lion", agency));
        agents.add(new Agent("duck", agency));
        agents.add(new Agent("eagle", agency));
        agents.add(new Agent("elephant", agency));
        agents.add(new Agent("cheetah", agency));
        agents.add(new Agent("falcon", agency));
        agents.add(new Agent("cougar", agency));
        agents.add(new Agent("rhinoceros", agency));

        for(int i=0; i<agents.size(); i++) {
            meeting.registrationMember(agents.get(i));
        }

        meeting.AnnounceWaysOfExtension("anons1");
        System.out.println();

        meeting.AnnounceSourceOfIncome("anons2");
        System.out.println();

        meeting.AnnounceLaunderingMethods("anons3");
        System.out.println();

        System.out.println("Agents exposed: " + meeting.countBlackListMembers() + ", Still undercover: " + (agents.size()-meeting.countBlackListMembers()));




    }
}
