package com.samplejava.springboot.algorithms.misc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String args[]) {
        isFizzBuzz(10);
    }

    public static void isFizzBuzz(Integer input) {
       List<Integer> allValue =  IntStream.range(1, input).boxed().toList();
       Map<Integer, String> outMap = new HashMap<>();
       for(int value : allValue) {
           if(value % 3 == 0 && value % 5 == 0) {
               outMap.put(value, "FizzBuzz");
           } else if (value % 3 ==0) {
               outMap.put(value, "Fizz");
           } else if (value % 5 == 0) {
               outMap.put(value,"Buzz");
           } else outMap.put(value, String.valueOf(value));
       }
        outMap.forEach((key, value) -> System.out.println(value));
    }

}