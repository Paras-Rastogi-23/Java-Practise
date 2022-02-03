package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("MC-Donalds","Chicken",12.3,"CheeseRoll");
        hamburger.addHamburgerAddition1("CatchUp",1.2);
        hamburger.addHamburgerAddition2("Cabbage",2.3);
        double totalBurgerCost = hamburger.itemizeListing();
        System.out.println("Total Cost of Burger is : $"+totalBurgerCost);

        System.out.println("\n\n*****************About Deluxe Burger*******************\n\n");
        DeluxeBurger db = new DeluxeBurger();
        double deluxeBurgerCost = db.itemizeListing();
        db.addHamburgerAddition1("tomato",2.3);
        System.out.println("Total cose of Deluxe Burger is : $"+deluxeBurgerCost);

        System.out.println("\n\n*****************About Deluxe Burger*******************\n\n");
        HealthyBurger healthyBurger = new HealthyBurger("Roasted Chicken",23.4);
        healthyBurger.addHamburgerAddition1("Garlic paste",3.2);
        healthyBurger.addHealthyAddition1("Cheese slices",8.3);
        double totalhealthyBurgerCost = healthyBurger.itemizeListing();
        System.out.println("The total cost of healthy Burger is : $"+totalhealthyBurgerCost);

    }
}
