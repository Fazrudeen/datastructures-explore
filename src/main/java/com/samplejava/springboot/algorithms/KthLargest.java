package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(2,5,1,6,7,5));
        int k = 3;
        System.out.println(getKthLargestUsingMinHeap(input, k));
        System.out.println(getKthLargestUsingMaxHeap(input, k));
    }

    private static Integer getKthLargestUsingMinHeap(List<Integer> input, Integer k) {
        if (input.size() < k) {
            return -1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(Integer each: input) {
            minHeap.add(each);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    private static Integer getKthLargestUsingMaxHeap(List<Integer> input, Integer k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(input);
        while(--k > 0) {
             maxHeap.poll();
        }
        return maxHeap.peek();
    }
}

