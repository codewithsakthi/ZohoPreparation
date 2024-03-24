package com.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        System.out.println(Arrays.deepToString(insert(intervals,newInterval)));
    }
    public  static int[][] insert(int[][] intervals, int[] target){
        List<int[]> res = new ArrayList<>();
        int curr = 0;
        while(curr < intervals.length && intervals[curr][1]<target[0]){
            res.add(intervals[curr++]);
        }
        while (curr < intervals.length && intervals[curr][0]<=target[1]){
            target[0]=Math.min(target[0],intervals[curr][0]);
            target[1]=Math.max(target[1],intervals[curr][1]);
            curr++;
        }
        res.add(target);
        while (curr < intervals.length){
            res.add(intervals[curr++]);
        }
        return res.toArray(new int[res.size()][2]);
    }
}
