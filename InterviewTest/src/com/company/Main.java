package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number  = 24;
        int duplicateNumber = 24;
        int fact =1;
        for(int i =1;i<number;i++){
                if(duplicateNumber % i == 0){
                    System.out.println(duplicateNumber+" check number");
                    duplicateNumber = duplicateNumber/i;
                }
                if(duplicateNumber == 1){
                    System.out.println(number+" is the factorial of "+i);
                    break;
                }
        }
    }
}
