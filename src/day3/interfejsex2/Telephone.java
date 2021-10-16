package day3.interfejsex2;

import java.util.Random;

public class Telephone implements Calling {
    private String telephoneNumber;
    private int totalTalkTime;


    public Telephone(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.totalTalkTime = 0;
    }

    @Override
    public void call(String number) {
        Random random = new Random();
        int isAnswered = random.nextInt(10);
        if (isAnswered < 5) {
            System.out.println("Call not answered");
        } else {
            System.out.println("I'm calling number " + number);
            int talkTime = random.nextInt(60) + 1;
            this.totalTalkTime += talkTime;
            System.out.println("You talking " + talkTime + " minutes");
        }


    }

    @Override
    public void callEmergencyNumber() {
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getTotalTalkTime() {
        return totalTalkTime;
    }
}
