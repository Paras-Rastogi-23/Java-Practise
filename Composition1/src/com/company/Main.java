package com.company;

public class Main {

    public static void main(String[] args) {


//        Wall wall1 = new Wall("EAST","White");
        Wall wall2 = new Wall("WEST","SkyBlue");
        Wall wall3 = new Wall("NORTH","Pink");
        Wall wall4 = new Wall("SOUTH","LightYellow");

        Ceiling ceiling = new Ceiling(30,"Red");
        Lamp lamp = new Lamp("Umbrella",true,10);

        Bed bed = new Bed("Dunlap",4,100,2,5);

        BedRoom bedRoom = new BedRoom(new Wall("EAST","White"),wall2,wall3,wall4,bed,ceiling,lamp);

        bedRoom.getWallDecoration();
        bedRoom.makebed();
        bed.make();
        bedRoom.getLamp().turnOn();
    }

}
