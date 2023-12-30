package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {
        System.out.println(findDuplicates());
    }

    private static Set<Integer> findDuplicates() {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 3, 4, 2, 2, 2, 2));
        Set<Integer> set = new HashSet<>();
        Set<Integer> OutList = new HashSet<>();

        arrayList.stream().forEach(x -> {
            if (!set.add(x)) {
                OutList.add(x);
            }
        });
        return OutList;
// Method 2
//        Map<Integer, Integer> mapValue = new HashMap<>();
//        arrayList.forEach( x -> {
//            if (mapValue.containsKey(x) ) {
//                mapValue.put(x, mapValue.get(x) + 1);
//            } else {
//                mapValue.put(x, 1);
//            }
//        });
//        mapValue.entrySet().forEach(y ->
//        {
//            if (y.getValue() > 1) {
//                System.out.println(y.getKey());
//            }
//        });
//    }
    }
}