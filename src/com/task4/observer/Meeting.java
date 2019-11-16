package com.task4.observer;
import java.util.*;

public class Meeting {

    private String waysOfextension; // способи розширення
    private String sourceOfIncome; // джерела надходження
    private String launderingMethods; // способи відмивання

    private List<InfoChannel> infoChannels = new ArrayList<>();
    private List<InfoChannel> blackListChannels = new ArrayList<>();


    public void registrationMember(InfoChannel infoChannel) {

        if (!blackListChannels.contains(infoChannel)) this.infoChannels.add(infoChannel);
    }


    public void removeMember(InfoChannel infoChannel) {

        this.infoChannels.remove(infoChannel);
    }

    public int countMembers() {

        return infoChannels.size();
    }

    public int countBlackListMembers() {

        return blackListChannels.size();
    }

    public void addToBlackList(InfoChannel infoChannel) {
        blackListChannels.add(infoChannel);
    }

    public void AnnounceWaysOfExtension(String text) {

        CheckMembers();
        this.waysOfextension = text;
        NotifyAll(text);
    }

    public void AnnounceSourceOfIncome(String text) {

        CheckMembers();
        this.sourceOfIncome = text;
        NotifyAll(text);
    }

    public void AnnounceLaunderingMethods(String text) {

        CheckMembers();
        this.launderingMethods = text;
        NotifyAll(text);
    }

    public void CheckMembers() {
        Random random = new Random();

        for (int i=0; i<infoChannels.size(); i++) {

            if ((random.nextInt(100) + 1) < 31) {
                
                if (infoChannels.get(i) instanceof Agent) {
                    infoChannels.get(i).update(new Message("Exposed!"));
                    addToBlackList(infoChannels.get(i));
                    removeMember(infoChannels.get(i));
                }
            }
        }
    }

    public void NotifyAll(String text) {

        for (int i = 0; i < infoChannels.size(); i++) {
            infoChannels.get(i).update(new Message(text));
        }

    }

}
