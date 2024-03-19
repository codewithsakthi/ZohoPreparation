package com.array;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] a ={1,2,3,1};
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : a) {
            map.merge(j, 1, Integer::sum);
        }

            System.out.println("false");
        }

    }
}
