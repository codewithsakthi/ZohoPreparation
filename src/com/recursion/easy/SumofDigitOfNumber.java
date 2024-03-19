package com.recursion.easy;

public class SumofDigitOfNumber {
    public static void main(String[] args) {
        System.out.println(cal(12345));
    }
    public static int cal(int number){
        if(number==0){
            return 0;
        }
        return number%10+cal(number/10);
    }
}
