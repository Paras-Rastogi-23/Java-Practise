package com.company;

public class Wall {
    private String Direction;
    private String Color;

    public Wall(String direction,String color) {
        this.Direction = direction;
        this.Color = color;
    }

    public String getDirection() {
        return Direction;
    }
    public void paintedWall(){
        System.out.println("Room with Wall of Direction "+this.Direction+" is decorated with paint "+this.Color);
    }

}

