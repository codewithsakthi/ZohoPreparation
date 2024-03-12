package com.recursion.easy;
public class MeanofArray {
    public static void main(String[] args) {
        int[] array = {1, 2};
        int n = array.length;
        double mean = calculation(array, n);
        System.out.println("Mean of the array: " + mean);
    }

    public static double calculation(int[] A, int n) {
        if (n == 1) {
            return A[0];
        }
        return (calculation(A,n-1)*(n-1)+A[n-1])/n;
    }
}
