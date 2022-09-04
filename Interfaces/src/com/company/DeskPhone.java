package com.company;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile Phone powered up");
        isOn = true;

    }

    @Override
    public void Dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now Ringing "+phoneNumber+" on the Mobile Phone");
        }else{
            System.out.println("Phone is Switched Off");
        }

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the phone");
            this.isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == this.myNumber && isOn){
            isRinging = true;
            System.out.println("Melody Ring");
        }else
            isRinging = false;
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
