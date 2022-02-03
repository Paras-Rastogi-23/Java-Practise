package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        customerList = new ArrayList<Customer>();
    }

    public void addCustomer(String customerName , Double initialAmount){
        int checkCustomerIndex = findCustomer(customerName);
        if(checkCustomerIndex == -1){
            Customer newCustomer = new Customer(customerName,initialAmount);
            customerList.add(newCustomer);
        }else {
            System.out.println(customerName + " is already exist in the Customer List");
        }
    }

    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }

    public void getCustomerTransactionList(String customerName){
        if(findCustomer(customerName) != -1){
            int customerIndex = findCustomer(customerName);
            System.out.println("      Transaction of "+customerName+" is following below:");
            Customer customer = customerList.get(customerIndex);
            ArrayList<Double> transactionList =  customer.getTransactionList();
            for (int i = 0; i < transactionList.size(); i++) {
                System.out.println("      "+(i+1)+". "+transactionList.get(i));
            }
        }
    }

    public int findCustomer(String name){
        if(this.customerList != null){
            for (int i = 0; i < this.customerList.size(); i++) {
                Customer customer = customerList.get(i);
                if (customer.getCustomerName().equals(name))
                    return i;
            }
        }
        return -1;
    }


    public String getBranchName(){
        return branchName;
    }


}
