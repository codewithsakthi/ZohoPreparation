package com.array;
import java.util.*;

public class TopK {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,3,4,4,4,4};
        int k=2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.merge(i,1,Integer::sum);
        }//1-2,2-2,3-1
        Map<Integer,List<Integer>> remap = new HashMap<>();
        for(int i:map.keySet()){
            int count = map.get(i);
            if(!remap.containsKey(count)){
                remap.put(count,new ArrayList<>());
            }
            remap.get(count).add(i);
        }
        //2-1,2 1-3
        int[] result = new int[k];
        int count=0;
        for(int i=nums.length;i>1;i--){
            if(remap.containsKey(i)){
                for(int j: remap.get(i)){
                    if (count >k){
                        break;
                    }
                    else{
                        result[count++]=j;
                    }
                }
            }
            if(count>k){
                break;
            }
        }
    System.out.println(Arrays.toString(result));
    }
}
