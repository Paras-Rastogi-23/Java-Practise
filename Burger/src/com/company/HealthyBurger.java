package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1price;
    private String healthyExtra2Name;
    private double healthyExtra2price;

    public HealthyBurger(String meat, double price) {
        super("Large Butter Delicious", meat, price, "Fried Cheese Roll");
    }

    public void addHealthyAddition1(String name,double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1price = price;
    }

    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2price = price;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        super.addHamburgerAddition3(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4(name, price);
    }

    @Override
    public double itemizeListing() {

        double healthyBurgerPrice = super.itemizeListing();

        if(this.healthyExtra1price>0.0){
            System.out.println("Addon extra healthy item : "+this.healthyExtra1Name+" of cost $"+this.healthyExtra1price);
            healthyBurgerPrice += this.healthyExtra1price;
        }

        if(this.healthyExtra2price>0.0){
            System.out.println("Addon extra healthy item : "+this.healthyExtra2Name+" of cost $"+this.healthyExtra2price);
            healthyBurgerPrice += this.healthyExtra2price;
        }
        return healthyBurgerPrice;
    }
}
