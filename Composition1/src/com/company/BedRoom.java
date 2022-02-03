package com.company;

public class BedRoom {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Bed bed;
    private Ceiling ceiling;
    private  Lamp lamp;

    public BedRoom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Ceiling ceiling,Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public void makebed(){
        System.out.println("BedRoom.MakeBed() : Your bed is Ready");
    }

    public void getWallDecoration(){
      this.wall1.paintedWall();
      this.wall2.paintedWall();
      this.wall3.paintedWall();
      this.wall4.paintedWall();
    }

    public Lamp getLamp(){
        return this.lamp;
    }



}
