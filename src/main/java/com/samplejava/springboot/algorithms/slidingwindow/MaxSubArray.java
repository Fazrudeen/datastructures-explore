package com.samplejava.springboot.algorithms.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(-2, 1, -3));
        System.out.println(maxSubArray(arrayList));
    }

    public static Integer maxSubArray(List<Integer> arrayList) {
        Integer currentMax = arrayList.get(0);
        Integer MaxSoFar = arrayList.get(0);
        for(int i= 1; i < arrayList.size(); i++) {
            currentMax = Math.max(arrayList.get(i), currentMax + arrayList.get(i));
            MaxSoFar = Math.max(currentMax, MaxSoFar);
        }
        return MaxSoFar;
    }

}