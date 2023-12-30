package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MergeArrayAndSort {

    //List<List>> to  List -> arrayListList.stream().flatMap(List::stream).toList();
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,3,4));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,1,2,3,4));
        list1.addAll(list2);
        list1.addAll(list3);
        List<Integer> outList = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(list1);
        for(int i = 0; i < list1.size(); i++) {
            outList.add(priorityQueue.poll());
        }
        System.out.println(outList);
    }
}