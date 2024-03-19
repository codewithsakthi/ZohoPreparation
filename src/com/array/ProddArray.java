package com.array;

import java.util.Arrays;

public class ProddArray extends  Solution{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0]=1;
        for(int i=1;i<nums.length;i++){
            result[i]= nums[i-1]*result[i-1];
        }

        int prod =1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*prod;
            prod*=nums[i];
        }
        return result;

    }
}