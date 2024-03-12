package com.recursion.easy;

public class SumofNat {
    public static void main(String[] args) {
        System.out.println(calculate(2));
    }
    public static int calculate(int num){
        if(num<=1){
            return num;
        }
        return num+ calculate(num-1);
    }
}
