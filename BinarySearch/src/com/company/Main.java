package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int A[] = {2, 4, 5, 12, 13, 15, 17, 23, 24, 25, 26, 34, 35, 36, 45};
        int n = A.length;

        int index = binarySearch(A, 0, (n - 1), 36);
        if (index == -1)
            System.out.println("Number not Present");
        else {
            System.out.println("Element present at Index : "+index);
        }
    }

   public static int binarySearch(int A[], int l, int r, int num)
    {
        if(l<=r){
            int m = l+(r-l)/2;

            if(A[m]==num){
                return m;
            }
            if(A[m]<num){
                return binarySearch(A,m+1,r,num);
            }if(A[m]>num)
            {
                return binarySearch(A,l,m-1,num);
            }
        }
        return -1;
    }
}
