package com.samplejava.springboot.algorithms.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumTwo {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4));
        Integer sum = 10;
        System.out.println(twoSum(input, sum));
    }

    private static List<Integer> twoSum(List<Integer> input, Integer sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < input.size(); i++){
            Integer toFind = sum - input.get(i);
            if (map.containsKey(toFind)) {
                return Arrays.asList(map.get(toFind), i);
            }
            map.put(input.get(i), i);
        }
        return Collections.emptyList();
    }
}


