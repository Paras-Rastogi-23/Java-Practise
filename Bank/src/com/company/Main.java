package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank1 = new Bank("BOI");
        bank1.addBranch("MBD Branch");
        bank1.addBranch("Meerut Branch");
        bank1.addBranch("Delhi Branch");
        bank1.getBranchList();

        Bank bank2 = new Bank("SBI");
        bank2.addBranch("Lucknow Branch");
        bank2.addBranch("Punjab Branch");
        bank2.addBranch("Goa Branch");
        bank2.getBranchList();

        bank1.addCustomer("MBD Branch","Paras",23.34);
        bank1.addCustomer("MBD Branch","Sona",45.34);
        bank1.addCustomer("MBD Branch","Meggie",56.39);
        bank1.addCustomer("MBD Branch","Bhavya",34.44);

        bank2.addCustomer("Goa Branch","kd",34.56);
        bank2.addCustomer("Goa Branch","Daksh G",34.56);
        bank2.addCustomer("Goa Branch","Shweta",34.56);

        bank1.listCustomer("MBD Branch",false);

        bank2.addTransactionOfCustomer("Goa Branch","kd",34.67);
        bank2.addTransactionOfCustomer("Goa Branch","kd",78.67);
        bank2.listCustomer("Goa Branch",true);
        bank2.getBranchList();

        bank2.findBranchInBank("Goa Branch");
    }
}
