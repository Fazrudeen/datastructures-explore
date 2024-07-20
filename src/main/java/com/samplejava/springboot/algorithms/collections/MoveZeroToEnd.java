package com.samplejava.springboot.algorithms.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToEnd {

    public static void main(String[] args) {
       List<Integer> arrayList = new ArrayList<>(Arrays.asList(0,0,0,1,2));
        System.out.println(moveZeroesToEnd(arrayList));
    }

    public static List<Integer> moveZeroesToEnd(List<Integer> inbound) {
        int swapIndex = 0;
        for(int i=0; i < inbound.size(); i++) {
            if(inbound.get(i) != 0){
                Integer currentValue = inbound.get(i);
                Integer swapValue = inbound.get(swapIndex);
                inbound.set(swapIndex, currentValue);
                inbound.set(i, swapValue);
                swapIndex++;
            }
        }
        return inbound;
    }
}
