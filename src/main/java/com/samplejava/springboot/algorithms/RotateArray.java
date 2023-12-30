package com.samplejava.springboot.algorithms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RotateArray {

    public static void main(String[] args) {
        rotateArray(3);
    }

    private static Deque<Integer> rotateArray(int k) {
        Deque<Integer> dequeList = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6,7));
        for(int i =0; i < k; i++) {
            dequeList.addFirst(dequeList.pollLast());
        }
        return dequeList;
    }
}
