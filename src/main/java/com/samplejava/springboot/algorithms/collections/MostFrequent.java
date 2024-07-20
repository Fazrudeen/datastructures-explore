package com.samplejava.springboot.algorithms.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class MostFrequent {

    public static void main(String args[]) {
        Integer limit = 2;
        List<Integer> inputList = new ArrayList<>(List.of(1,1,1,2,2,3,3,3,3,3));
        System.out.println(MostFrequent(inputList, limit));
    }

    public static List<Integer> MostFrequent(List<Integer> inputList, Integer limit) {
        if(inputList.size() == 1) {
            return inputList;
        }
        HashMap<Integer, Integer> tempMap = new HashMap<>();
        for(Integer each: inputList) {
            if(tempMap.containsKey(each)) {
                tempMap.put(each, tempMap.get(each) + 1);
            } else {
                tempMap.put(each, 1);
            }
        }

        PriorityQueue<HashMap<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
            int keyInA = a.keySet().iterator().next(); // key of a
            int keyInB = b.keySet().iterator().next(); // key of b
            return b.get(keyInB) - a.get(keyInA);
        });

        pq.add(tempMap);

        List<Map.Entry<Integer, Integer>> sortedMap = tempMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();

        AtomicInteger currentLimit = new AtomicInteger(0);
        List<Integer> outputList = new ArrayList<>();
        sortedMap.forEach( x -> {
            if(currentLimit.get() < limit) {
                outputList.add(x.getKey());
                currentLimit.incrementAndGet();
            }
        });

        return outputList;
    }

}

// sort map by value
//List<Map.Entry<Integer, Integer>> valueMap = tempMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
// get element frequency from list
// Map<String, Long> frequencyMap = inputList.stream()
//           .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
// Max from map
//Map.Entry<Integer, Integer> maxValue = tempMap.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
