package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactionList = new ArrayList<Double>();

    public Customer(String customerName, Double initialAmount) {
        this.customerName = customerName;
        this.transactionList.add(initialAmount);
    }

    public void addTransaction(Double amount){
        this.transactionList.add(amount);
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public ArrayList<Double> getTransactionList(){
        return this.transactionList;
    }
}
