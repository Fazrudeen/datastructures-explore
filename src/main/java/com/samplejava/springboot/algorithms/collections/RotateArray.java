package com.samplejava.springboot.algorithms.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {
        System.out.println(rotateArray(3));
    }

    private static Deque<Integer> rotateArray(int k) {
        ArrayList<Integer> inArray = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Deque<Integer> dequeList = new ArrayDeque<>(inArray);
        for(int i =0; i < k; i++) {
            int getValue = dequeList.pollLast();
            dequeList.addFirst(getValue);
        }
        return dequeList;
    }
}
