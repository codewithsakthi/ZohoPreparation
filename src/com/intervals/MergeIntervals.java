package com.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    static int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    public static void main(String[] args) {
    int[][] ans =merge(intervals);
    for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }
    }
    public static int[][] merge(int[][] interval){
        Arrays.sort(interval,(a, b)->a[0]-b[0]);
        int index =0;
        List<int[]> reslist = new ArrayList<>();
        while(index < interval.length){
            int newstart = interval[index][0];
            int currend  = interval[index][1];
            while (index < interval.length-1 && currend >= interval[index+1][0]){
                currend = Math.max(currend,interval[index+1][1]);
                index+=1;
            }
            int newend = currend;
            reslist.add(new int[]{newstart,newend});
            index++;
        }
        int[][] result = new int[reslist.size()][2];
        index=0;
        for(int[] i: reslist){
            result[index++]= i;
        }
        return result;
    }
}

