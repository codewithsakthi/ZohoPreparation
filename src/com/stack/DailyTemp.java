package com.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.*;
public class DailyTemp {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};

        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static  int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<temperatures.length;i++) {
            if (stack.isEmpty() || temperatures[stack.peek()] >= temperatures[i]){
                stack.push(i);
            }
            while (!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int last =stack.pop();
                result[last] = i - last;
            }
            stack.push(i);
        }
        return result;
    }
}
