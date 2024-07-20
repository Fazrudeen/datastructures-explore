package com.samplejava.springboot.algorithms.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class RemoveStars {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("eras****"));
    }

    public static String removeStars(String input) {
        char[] input1 = input.toCharArray();
        Deque<String> deque = new ArrayDeque<>();
        for(char each: input1) {
            if(each == '*') {
                deque.removeLast();
            } else {
                deque.add(String.valueOf(each));
            }
        }
       String output = deque.stream().collect(Collectors.joining());
       return output;
    }
}
