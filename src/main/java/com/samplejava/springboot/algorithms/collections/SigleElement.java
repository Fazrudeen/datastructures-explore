package com.samplejava.springboot.algorithms.collections;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SigleElement {

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(2,4,2,4,1,4));
        System.out.println(getSingle(inputList));
    }

    public static Integer getSingle(List<Integer> inputList) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer each: inputList) {
            if(map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        for(Map.Entry<Integer, Integer> each: map.entrySet()) {
            if(each.getValue() == 1) {
                return each.getKey();
            }
        }
        return -1;
    }
}
