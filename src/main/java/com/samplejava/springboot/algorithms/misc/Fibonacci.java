package com.samplejava.springboot.algorithms.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(getFibonacci(8));
    }

    private static List<Integer> getFibonacci(Integer number) {
        List<Integer> fib = new ArrayList<>();
        Integer previous = 0;
        Integer current = 1;
        fib.add(previous);
        fib.add(current);
        for(int i=0; i < number; i++) {
            int temp = previous + current;
            previous = current;
            current = temp;
            fib.add(current);
        }
        return fib;
    }
}
