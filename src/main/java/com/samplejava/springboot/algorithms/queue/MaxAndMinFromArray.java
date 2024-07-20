package com.samplejava.springboot.algorithms.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaxAndMinFromArray {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(7,4,6,8,2,5));
        getMaxAndMinFromArray(input);
    }

    private static void getMaxAndMinFromArray(List<Integer> input) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i < input.size(); i++){
            minHeap.add(input.get(i));
            maxHeap.add(input.get(i));
        }
        System.out.println("Minimum Value is " + minHeap.poll());
        System.out.println("Maximum Value is " + maxHeap.poll());
    }
}


