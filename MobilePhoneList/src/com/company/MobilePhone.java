package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String  myNumber;
    private ArrayList<Contact> myContactList ;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContactList=  new ArrayList<Contact>();
    }

    public void printContactList(){
        if(myContactList.size()>0){
            for (int i = 0; i < myContactList.size(); i++) {
                System.out.println(i+1+". "+myContactList.get(i).getContactName()+" : "+myContactList.get(i).getContactNumber());
            }
        }else{
            System.out.println("Your contact list is Empty!");
        }

    }

    public void addContact(Contact contact){
        int checkForDuplicateName = findContactByName(contact.getContactName());
        int checkForDuplicateNumber = findContactByNumber(contact.getContactNumber());
        if(checkForDuplicateName>=0){
            System.out.println("This contact with name "+contact.getContactName()+" is already Exist!");
        }else if(checkForDuplicateNumber>=0){
            System.out.println("This contact with number "+contact.getContactNumber()+" is already Exist!");
        }
        else{
            this.myContactList.add(contact);
            System.out.println("Your contact added successfully!");
        }
    }

    public int findContactByName(String name){
        for (int i = 0; i < myContactList.size(); i++) {
            if(myContactList.get(i).getContactName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public int findContactByNumber(String number){
        for (int i = 0; i < myContactList.size(); i++) {
            if(myContactList.get(i).getContactNumber().equals(number)){
                return i;
            }
        }
        return -1;
    }

    public void modifyContactName(String oldName , String newName){
        int checkForDuplicateName = findContactByName(oldName);
        if(checkForDuplicateName>=0){
            Contact contact = this.myContactList.get(checkForDuplicateName);
            contact.updateContactName(contact,newName);
            this.myContactList.set(checkForDuplicateName , contact);
            System.out.println("Your contact name is Updated!");
        }
        else{
            System.out.println("The contact with name : "+oldName+" is not Exist!");
        }
    }

    public void modifyContactNumber(String oldnumber , String newNumber){
        int checkForDuplicateNumber = findContactByNumber(oldnumber);
        if(checkForDuplicateNumber>=0){
            Contact contact = this.myContactList.get(checkForDuplicateNumber);
            contact.updateContactNumber(contact,newNumber);
            this.myContactList.set(checkForDuplicateNumber , contact);
            System.out.println("Your contact number is Updated!");
        }
        else{
            System.out.println("The contact with number : "+oldnumber+" is not Exist!");
        }
    }

    public void removeContactByName(String Name){
        int checkForDuplicateName = findContactByName(Name);
        if(checkForDuplicateName>=0){
            this.myContactList.remove(checkForDuplicateName);
            System.out.println("Your contact name is Removed!");
        }
        else{
            System.out.println("The contact with name : "+Name+" is not Exist!");
        }
    }

    public void removeContactByNumber(String Number){
        int checkForDuplicateNumber = findContactByNumber(Number);
        if(checkForDuplicateNumber>=0){
            this.myContactList.remove(checkForDuplicateNumber);
            System.out.println("Your contact name is Removed!");
        }
        else{
            System.out.println("The contact with name : "+Number+" is not Exist!");
        }
    }
}
