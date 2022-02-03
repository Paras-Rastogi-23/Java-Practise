package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50,false);

        System.out.println("Toner Amount of Printer is : "+printer.addtoner(0));
        System.out.println("Pages required to print 123 copies is : "+printer.printPages(123));
        System.out.println("Total Pages utilize by printer = "+printer.getPagesPrinted());
        System.out.println("Pages required to print 34 copies is : "+printer.printPages(34));
        System.out.println("Total Pages utilize by printer = "+printer.getPagesPrinted());
    }
}
