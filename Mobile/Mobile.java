package Mobile;

import java.util.ArrayList;

public class Mobile {
    private int Pin;
    private String messageDraft ;
    private ArrayList<String> inbox;
    private ArrayList<String> sentMessage;
    private boolean powerOn;
    public Mobile(){
        this.Pin = 100;
        this.messageDraft = "";
        this.inbox = new ArrayList<>();
        this.sentMessage = new ArrayList<>();
        this.powerOn = false;
    }
    public int getPin(){
        return Pin;
    }
    public void setPin(int Pin){
        this.Pin = Pin;
    }
    public String getMessageDraft(){
        return messageDraft;
    }
    public void setMessageDraft(String messageDraft){
        this.messageDraft = messageDraft;
    }
    public ArrayList<String > getInbox(){
        return inbox;
    }
    public ArrayList<String> getSentMessage(){
        return getSentMessage();
    }
    public boolean isPowerOn(){
        return powerOn;
    }
    public void setPowerOn(boolean powerOn){
        this.powerOn = powerOn;
    }
    public void checkPowerStatus(){
        
    }
}
