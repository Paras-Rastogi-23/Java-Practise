package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player("Paras",23,65);
        System.out.println(player.toString());
        player.setStrength(63);
        System.out.println(player);
        player.setWeapon("Bow & Arrow");
        System.out.println(player);
        saveObject(player);
        loadObject(player);
        System.out.println(player+" Last Output");
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public  static  void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size();i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+ " to Storage Device");
        }
    }

    public  static  void  loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
