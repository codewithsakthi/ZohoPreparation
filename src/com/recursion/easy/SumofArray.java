package com.recursion.easy;

public class SumofArray {
    public static void main(String[] args) {
        int[] A= new int[]{1,2,3,4,5};
        int n=A.length;
        System.out.println(sum(A,n));
    }
    public static int sum(int[] A,int n){
        if(n==1){
            return A[0];
        }
        return (sum(A,n-1)+A[n-1]);

    }
//tail recursive
//    public static int sum(int[] A,int n,int ans){
//        if(n==0){
//            return ans;
//        }
//        return (sum(A,n-1,ans+A[n-1]));
//
//    }
}
