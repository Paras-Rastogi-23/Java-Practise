package com.company;
class Hundaie extends Car{

    public Hundaie(String name, int cylinders) {
        super(name,cylinders);
    }

    public String startEngine(){
        return getClass().getSimpleName() + " gets startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName()+" gets Accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName()+" gets Brake()";
    }
}

class Oddy extends Car{

    public Oddy(String name, int cylinders) {
        super(name,cylinders);
    }

    public String startEngine(){
        return getClass().getSimpleName() + " gets startEngine()";
    }

    public String accelerate(){
        return "Oddy gets Accelerate()";
    }

    public String brake(){
        return "Oddy gets Brake()";
    }
}

class Toyota extends Car{

    public Toyota(String name, int cylinders) {
        super(name,cylinders);
    }

    public String startEngine(){
        return getClass().getSimpleName() + " gets startEngine()";
    }

    public String accelerate(){
        return "Toyota gets Accelerate()";
    }

    public String brake(){
        return "Toyota gets Brake()";
    }
}

class Car {
    private boolean Engine;
    private int Wheel;
    private String Name;
    private int Cylinders;

    public Car(String name, int cylinders) {
        this.Name = name;
        this.Cylinders = cylinders;
        this.Wheel = 4;
        this.Engine = true;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " gets startEngine()";
    }

    public String accelerate(){
        return "Car gets Accelerate()";
    }

    public String brake(){
        return "Car gets Brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Car("Car",6);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Oddy oddy = new Oddy("Car",6);
        System.out.println(oddy.startEngine());
        System.out.println(oddy.accelerate());
        System.out.println(oddy.brake());

        Toyota toyota = new Toyota("Car",6);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Hundaie hundai = new Hundaie("Car",6);
        System.out.println(hundai.startEngine());
        System.out.println(hundai.accelerate());
        System.out.println(hundai.brake());
    }
}


