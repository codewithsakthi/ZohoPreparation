package com.TwoPointers;

import java.util.*;

public class PermutationString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bdbccba";
        if (isPermutation(s1, s2))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static boolean isPermutation(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        int i = 0;
        int j = 0;
        while (j < s2.length()) {
            char c = s2.charAt(j);

            if (!map.containsKey(c)) {
                i = j + 1;
                have.clear();
            } else {
                have.merge(c, 1, Integer::sum);
                while (have.get(c) > map.get(c)) {
                    char startchar = s2.charAt(i);
                    have.put(startchar, have.get(startchar) - 1);
                    i++;
                }
                int windsize = j - i + 1;

                if (windsize == s1.length()) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}
