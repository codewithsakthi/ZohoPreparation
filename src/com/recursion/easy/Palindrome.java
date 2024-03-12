package com.recursion.easy;

public class Palindrome {
    public static void main(String[] args) {
    if(isPalindrome("racecar")){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    }
    public static Boolean isPalindrome(String input){
        if(input.length()==1 || input.length()==0){
            return true;
        }
        if(input.charAt(0)==input.charAt(input.length()-1)){
            return isPalindrome(input.substring(1,input.length()-1));
        }
        return false;
    }
}
