package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingFirstInteger {

    public static void main(String[] args) {
        System.out.println(missigFirstInt());
    }

    static Integer missigFirstInt() {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,-1,1,3,6,8));
        List<Integer> distinctValue = integerList.stream().distinct().filter(x -> x > 0).sorted().toList();
        for(Integer each :distinctValue) {
            int nextValue = distinctValue.indexOf(each) + 1;
            if (each != nextValue){
                return nextValue;
            }
        }
        return distinctValue.size() + 1;
    }
}

