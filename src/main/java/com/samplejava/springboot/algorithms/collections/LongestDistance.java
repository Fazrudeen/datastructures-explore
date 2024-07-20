package com.samplejava.springboot.algorithms.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class LongestDistance {

    public static void main(String[] argv) {
        String[] garden_1 = {"Ivy", "Rue", "Ivy", "Yew", "Rue", "Dock", "Iris", "Rue", "Lily"};
        String[] garden_2 = {"Rose"};
        String[] garden_3 = {"Ivy", "Rue", "Yew", "Arum", "Dock", "Iris", "Lily", "Reed", "Rose"};
        String[] garden_4 = {"Sage", "Rose", "Sage", "Reed", "Sage", "Lily", "Sage", "Iris", "Dock", "Sage", "Yew", "Rue", "Ivy"};
        String[] garden_5 = {"Dock", "Arum", "Yew", "Rue", "Ivy", "Ivy", "Rue", "Yew", "Arum", "Dock", "Iris", "Lily", "Reed", "Rose", "Sage", "Dock"};
        String[] garden_6 = {"Rose", "Rose", "Rose", "Rose", "Rose", "Rose"};
        String[] garden_7 = {"Iris", "Iris"};
        System.out.println(getLongest(garden_1));
    }

    private static int getLongest(String[] garden_1){
        List<String> distinct = Arrays.stream(garden_1).distinct().toList();
        if (garden_1.length == 1 || distinct.size() == garden_1.length) {
            return -1; // All elements are distinct or there is only one element
        }

        Map<String, List<Integer>> countMap = new HashMap<>();
        Map<String, Integer> outMap = new HashMap<>();

        for (int i = 0; i < garden_1.length; i++) {
            if (countMap.containsKey(garden_1[i])) {
                List<Integer> indices = countMap.get(garden_1[i]);
                indices.add(i);
                countMap.put(garden_1[i], indices);
            } else {
                countMap.put(garden_1[i], new ArrayList<>(Arrays.asList(i)));
            }
        }

        for (Map.Entry<String, List<Integer>> entry : countMap.entrySet()) {
            List<Integer> indices = entry.getValue();
            if (indices.size() == 1) {
                outMap.put(entry.getKey(), 1);
            } else {
                int maxDistance = indices.get(indices.size() - 1) - indices.get(0);
                outMap.put(entry.getKey(), maxDistance);
            }
        }

        Map.Entry<String, Integer> maxValue = outMap.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);

        return maxValue.getValue();
    }
}