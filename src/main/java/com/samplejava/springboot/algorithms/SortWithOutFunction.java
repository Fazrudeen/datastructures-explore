package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SortWithOutFunction {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(8,1,2, 5, 3, 4, 6));
        System.out.println(sortIntegerUsingPriorityQueue(arrayList));
        System.out.println(sortInteger(arrayList));
    }

    public static List<Integer> sortInteger(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        return arrayList;
    }

    public static List<Integer> sortIntegerUsingPriorityQueue(List<Integer> arrayList) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        List<Integer> out = new ArrayList<>();
        arrayList.forEach( x -> {
            priorityQueue.add(x);
        });
        for(int i = 0; i <arrayList.size(); i++ ) {
            out.add(i, priorityQueue.poll());
        }
        return out;
    }
}