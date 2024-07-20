package com.samplejava.springboot.algorithms.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LimitDuplicate {

    public static void main(String args[]) {
        Integer limit = 3;
        List<String> inputList = new ArrayList<>(List.of("cat", "cat", "dog", "dog","dog", "dog", "rat" ));
//        Map<String, Long> frequencyMap = inputList.stream()
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(limitDup(inputList, limit));
    }

    public static List<String> limitDup(List<String> inputList, Integer limit) {
        if(inputList.size() <= 3) {
            return inputList;
        }
        Map<String, Integer> tempMap = new HashMap<>();
        List<String> outputList = new ArrayList<>();
        for(String each: inputList) {
            if (!tempMap.containsKey(each)) {
                tempMap.put(each, 1);
                outputList.add(each);
            } else {
                if(tempMap.get(each) < limit ) {
                    outputList.add(each);
                }
                tempMap.put(each, tempMap.get(each) + 1);
            }
        }
        return outputList;
    }
}