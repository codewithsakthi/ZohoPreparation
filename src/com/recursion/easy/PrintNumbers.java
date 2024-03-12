package com.recursion.easy;

import java.util.Scanner;

public class PrintNumbers {
    //Print 1 to n without using loops
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        display(x);
    }
    public static void display(int s){
        if(s>0){
            display(s-1);
            System.out.println(s);
        }
        return;
    }
}
