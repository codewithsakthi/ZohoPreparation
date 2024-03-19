package com.recursion.easy;

public class Decimaltobin {
    public static void main(String[] args) {
        System.out.println(calculation(8,""));
    }
    public static String calculation(int number,String result){
        if(number == 0){
            return result;
        }
        result = number % 2+ result;
        return calculation(number/2,result);
    }
}
