package com.samplejava.springboot.algorithms.collections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayComparision {

//    Input: nums1 = [1,2,3], nums2 = [2,4,6]
//    Output: [[1,3],[4,6]]

    public static void main(String[] args) {
        List<Integer> one = new ArrayList<>(Arrays.asList(1,2,3,3));
        List<Integer> two = new ArrayList<>(Arrays.asList(1,1,2,2));
    }

    public static List<Set<Integer>> compareArray(List<Integer> one, List<Integer> two) {
        List<Set<Integer>> outList = new ArrayList<>();
        outList.add(compare(one, two));
        outList.add(compare(two, one));
        return outList;
    }

    public static Set<Integer> compare(List<Integer> compare, List<Integer> compareWith) {
        Set<Integer> set = new HashSet<>();
        compare.stream().forEach(x -> {
            if (!compareWith.contains(x)) {
                set.add(x);
            }
        });
        return set;
    }

}
