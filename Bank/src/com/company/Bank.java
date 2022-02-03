package com.company;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchList = new ArrayList<Branch>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addBranch(String branchName){
        if(findBranch(branchName) == -1){
            Branch branch = new Branch(branchName);
            branchList.add(branch);
            System.out.println("Branch "+branchName+" is added to "+bankName+" Bank.");
        }else{
            System.out.println(findBranch(branchName)+"Branch with name : "+branchName+" is already exist");
        }

    }

    public int findBranch(String branchName){
        for (int i = 0; i < branchList.size(); i++) {
            Branch branch = branchList.get(i);
            if(branch.getBranchName().equals(branchName))
            return i;
        }
        return -1;
    }

    public void findBranchInBank(String branchName){
        boolean check = false;
        for (int i = 0; i < branchList.size(); i++) {
            Branch branch = branchList.get(i);
            if(branch.getBranchName().equals(branchName)) {
                System.out.println(branchName+" is exist in Bank "+bankName);
                check =true;
                break;
            }
        }
        if(!check){
            System.out.println(branchName+" is not exist in Bank "+bankName);
        }
    }

    public void addCustomer(String branchname , String customerName,Double initialAmount){
        if(findBranch(branchname) != -1){
            int branchPosition = findBranch(branchname);
            Branch branch = branchList.get(branchPosition);
            branch.addCustomer(customerName,initialAmount);
            System.out.println("New Customer "+customerName+" is added in the Branch "+branchname+" of Bank "+bankName);
        }
        else{
            System.out.println("Customer added with wrong details");
        }
    }

    public void listCustomer(String branchname,boolean showTransactions){
        if(findBranch(branchname) != -1){
            int branchPosition = findBranch(branchname);
            Branch branch = branchList.get(branchPosition);
            ArrayList<Customer> customerList = branch.getCustomerList();
            System.out.println("Customer of Branch " +branchname+" is following below :");
            for (int i = 0; i < customerList.size(); i++) {
                System.out.println((i+1)+". "+customerList.get(i).getCustomerName());
                if(showTransactions){
                    branch.getCustomerTransactionList(customerList.get(i).getCustomerName());
                }
            }
        }else{
            System.out.println("Details are wrong for listing the customer");
        }
    }

    public void getBranchList(){
        System.out.println("Branches under the Bank "+bankName+" is mentioned below :");
        for (int i = 0; i < branchList.size(); i++) {
            System.out.println("Branch "+(i+1)+".  -->  "+branchList.get(i).getBranchName());
        }
    }

    public void addTransactionOfCustomer(String branchName , String customerName , Double Amount){
        if(findBranch(branchName) != 1){
            int branchIndex = findBranch(branchName);
            Branch branch = branchList.get(branchIndex);
            int customerListIndex = branch.findCustomer(customerName);
            if(customerListIndex != -1){
                ArrayList<Customer> customerList = branch.getCustomerList();
                Customer customer = customerList.get(customerListIndex);
                customer.addTransaction(Amount);
                System.out.println("New Transaction of $"+Amount+" is add to the account of "+customerName+" of Branch"+branchName+" of Bank"+bankName);
            }else{
                System.out.println("This customer name is not exist\n"+
                        "Can't add transaction for this customer");
            }
        }else{
            System.out.println("This branch name is not exist\n"+
                    "Can't add transaction for this Branch");
        }
    }
}
