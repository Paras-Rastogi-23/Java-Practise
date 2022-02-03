package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static  MobilePhone phone = new MobilePhone("8171561115");

    public static void main(String[] args) {
        // write your code here
        startPhone();
        displayActions();
        Boolean start = true;
        startFunction(start);
    }

    public static void displayActions(){
        System.out.println("Please Enter your choice");
        System.out.println("0. Shut Down the phone\n" +
                "1. Print the Contact List\n" +
                "2. Add new Contact\n" +
                "3. Edit a Contact\n" +
                "4. Find a Contact\n" +
                "5. Remove a Contact\n" +
                "6. Display the Actions\n");
    }

    public static void startFunction(boolean start){
        while (start) {
            System.out.println("Enter Actions : (6 to display The Actions)");
            int choice = sc.nextInt();
                switch (choice) {
                    case 0:
                        System.out.println("Shutting Down");
                        start = false;
                        break;
                    case 1:
                        displayContactList();
                        break;
                    case 2:
                        addNewContact();
                        break;
                    case 3:
                        editContact();
                        break;
                    case 4:
                        findContact();
                        break;
                    case 5:
                        removeContact();
                        break;
                    case 6:
                        displayActions();
                        break;
                    default:
                        System.out.println("Please enter a valid choice");
                        break;
                }

        }
    }

    public static void startPhone(){
        System.out.println("Your Mobile is Ready");
        startFunction(true);
    }

    public static void displayContactList(){
        phone.printContactList();
        sc.nextLine();
        startFunction(true);
    }

    public static void editContact(){
        System.out.println("1. to Edit a name\n" +
                "2. Edit a number");
        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch){
            case 1:
                System.out.println("Enter the name of Existing Contact which you want to Edit");
                String oldName = sc.nextLine();
                System.out.println("Enter the new name to be updated");
                String newName = sc.nextLine();
                phone.modifyContactName(oldName,newName);
                break;
            case 2:
                System.out.println("Enter the number of Existing Contact which you want to Edit");
                String oldNumber = sc.nextLine();
                System.out.println("Enter the new number to be updated");
                String newNumber = sc.nextLine();
                phone.modifyContactNumber(oldNumber,newNumber);
        }
        startFunction(true);

    }

    public static void addNewContact(){
        System.out.println("Enter the name of new Contact: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Enter number : ");
        String number = sc.next();
        sc.nextLine();
        Contact contact = Contact.createContact(name,number);
        phone.addContact(contact);
        startFunction(true);
    }

    public static void removeContact(){
        System.out.println("1. to remove a contact by name\n" +
                "2. to remove a contact by number");
        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch){
            case 1:
                System.out.println("Enter the name of Existing Contact which you want to Remove");
                String Name = sc.nextLine();
                phone.removeContactByName(Name);
                break;
            case 2:
                System.out.println("Enter the number of Existing Contact which you want to Remove");
                String Number = sc.nextLine();
                phone.removeContactByNumber(Number);
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
        startFunction(true);
    }

    public static void findContact(){
        System.out.println("1. to Find contact by a name\n" +
                "2. to Find contact by a number");
        int ch = sc.nextInt();
        sc.nextLine();
        int position;
        switch (ch){
            case 1:
                System.out.println("Enter the Name to find");
                String name = sc.nextLine();
                position = phone.findContactByName(name);
                int index = position+1;
                if(position>=0){
                    System.out.println("Name is found at position : "+index+"in the Contact List");
                }else{
                    System.out.println(name+ "is not found in the Contact List");
                }
                break;
            case 2:
                System.out.println("Enter the Number to find");
                String number = sc.nextLine();
                position = phone.findContactByNumber(number);
                int index2 = position+2;
                if(position>=0){
                    System.out.println("Number is found at position : "+index2+"in the Contact List");
                }else{
                    System.out.println(number+ "is not found in the Contact List");
                }
                break;
        }
        startFunction(true);
    }
}
