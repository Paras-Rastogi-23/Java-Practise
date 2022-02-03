package com.company;

public class Lamp {

    private String style;
    private Boolean battery;
    int globRating;

    public Lamp(String style, Boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn(){
        System.out.println("Lamp of style "+this.style+" & Global rating "+this.globRating+" is being turned On");
    }
}
