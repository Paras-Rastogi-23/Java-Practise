package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getPower(5,3));
    }

    public static int getPower(int n,int p){

        if(p==0){
            return 1;
        }else{
            return n*getPower(n,p-1);
        }


    }
}
