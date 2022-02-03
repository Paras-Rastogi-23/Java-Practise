package com.company;

public class Contact {
    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public static Contact createContact(String name,String number){
        Contact contact = new Contact(name,number);
        return contact;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void updateContactName(Contact contact,String name){
        contact.contactName =  name;
//        return contact;
    }

    public void updateContactNumber(Contact contact,String number){
        contact.contactNumber =  number;
//        return contact;
    }
}
