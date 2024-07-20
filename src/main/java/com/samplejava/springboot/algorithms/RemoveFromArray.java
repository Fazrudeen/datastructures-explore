package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoveFromArray {

    public static void main(String[] args) {
//        List<Integer> inputArray = new ArrayList<>(Arrays.asList(3,1,3,4,2));
//        List<Integer> inputArray = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> inputArray = new ArrayList<>(Arrays.asList(3,1,3,4,3, 3));
        int sum = 5;
        System.out.println(compareArray(inputArray, sum));
    }

    public static Integer compareArray(List<Integer> inputArray,int sum) {
        Map<Integer, Integer> trackingMap = new HashMap<>();
        AtomicInteger count = new AtomicInteger(0);
        int arraySize = inputArray.size();
        for(int i= 0; i < arraySize; i++) {
            int currentValue = inputArray.get(i);
            int remainingNeeded = sum - currentValue;
            if(trackingMap.containsKey(remainingNeeded)) {
                trackingMap.remove(remainingNeeded);
                trackingMap.remove(i);
                count.incrementAndGet();
            } else {
                trackingMap.put(currentValue, i);
            }
        }
        return count.get();
    }

}
