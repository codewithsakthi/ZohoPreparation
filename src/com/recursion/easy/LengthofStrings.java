package com.recursion.easy;

public class LengthofStrings {
    public static void main(String[] args) {
        String input ="hello";
        System.out.println(cal(input));
    }
    public static int cal(String input){
        int result=0;
        if(input.equals("")){
            return 0;
        }
        return cal(input.substring(1))+1;

    }
}
