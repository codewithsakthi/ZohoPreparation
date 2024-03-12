package com.recursion.easy;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println(Reversal("hello"));
    }
    public static String Reversal(String input){
        if(input.equals("")){
            return "";
        }
        return Reversal(input.substring(1))+ input.charAt(0);
    }
}
