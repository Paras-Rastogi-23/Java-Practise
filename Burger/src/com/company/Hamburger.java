package com.company;

public class Hamburger {
    private String Name;
    private String Meat;
    private double Price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        Name = name;
        Meat = meat;
        Price = price;
        this.breadRollType = breadRollType;
    }

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String name,double price){
        this.addition1Name =name;
        this.addition1Price=price;
    }

    public void addHamburgerAddition2(String name,double price){
        this.addition2Name =name;
        this.addition2Price=price;
    }

    public void addHamburgerAddition3(String name,double price){
        this.addition3Name =name;
        this.addition3Price=price;
    }

    public void addHamburgerAddition4(String name,double price){
        this.addition4Name =name;
        this.addition4Price=price;
    }
    
    public double itemizeListing(){
        System.out.println(this.Name+" Hamburger with meat type "+this.Meat+" on the "+this.breadRollType+" is worth of $"+this.Price);
        if(this.addition1Price>0.0){
            System.out.println("Addon "+this.addition1Name+" of cost $"+this.addition1Price);
            this.Price += this.addition1Price;
        }
        if(this.addition2Price>0.0){
            System.out.println("Addon "+this.addition2Name+" of cost $"+this.addition2Price);
            this.Price += this.addition2Price;
        }
        if(this.addition3Price>0.0){
            System.out.println("Addon "+this.addition3Name+" of cost $"+this.addition3Price);
            this.Price += this.addition3Price;
        }
        if(this.addition4Price>0.0){
            System.out.println("Addon "+this.addition4Name+" of cost $"+this.addition4Price);
            this.Price += this.addition4Price;
        }
        return this.Price;
    }
}
