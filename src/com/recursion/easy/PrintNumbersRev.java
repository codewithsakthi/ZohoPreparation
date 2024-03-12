package com.recursion.easy;

import java.util.Scanner;

public class PrintNumbersRev {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        display(num);
    }
    public  static void display(int n){
        if(n>0){
            System.out.println(n);
            display(n-1);
        }
    }
}
