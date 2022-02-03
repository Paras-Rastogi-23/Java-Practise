package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Plain Deluxe Burger", "Egg", 10.0, "Wheat roll");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Addition can not be added in the Deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Addition can not be added in the Deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Addition can not be added in the Deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Addition can not be added in the Deluxe burger");
    }

    @Override
    public double itemizeListing() {
        return super.itemizeListing();
    }
}
