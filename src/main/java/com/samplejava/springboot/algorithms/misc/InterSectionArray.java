package com.samplejava.springboot.algorithms.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class InterSectionArray {

    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(3,7,4,6));
        List<Integer> array2 = new ArrayList<>(Arrays.asList(3,4,4,6,5,6));
        System.out.println(interSection(array1, array2));
    }
    
    public static Set<Integer>  interSection(List<Integer> array1, List<Integer> array2) {
        Set<Integer> set = new HashSet<>();
        for (Integer integer : array1) {
            if (array2.contains(integer)) {
                set.add(integer);
            }
        }
        return set;
    }

}
