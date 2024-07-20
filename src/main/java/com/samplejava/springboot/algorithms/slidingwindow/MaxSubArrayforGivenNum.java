package com.samplejava.springboot.algorithms.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArrayforGivenNum {

    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(-2, 1, -3, 7));
        Integer k = 3;
        System.out.println(maxSubArray(arrayList, k));
    }

    public static Integer maxSubArray(List<Integer> arrayList, Integer k) {
        int currentSum = 0;
        int maxSum = 0;
        for(int i= 0; i < arrayList.size() - k +1; i++) {
            currentSum = 0;
            for(int j= i; j < i + k; j++) {
                currentSum += arrayList.get(j);
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

}