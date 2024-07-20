package com.samplejava.springboot.algorithms.queue;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecodeString {

    // not working
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }

    public static String decodeString(String input) {
       return check(input);
    }

    public static String check(String inval) {
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder tempBuilder = new StringBuilder();
        for(int i = 0; i < inval.length(); i++) {
            if(inval.charAt(i) == ']') {
                String temp = deque.pollLast();
                if (!Objects.equals(temp, "[")) {
                    tempBuilder.append(temp);
                } else {
                    int number = Integer.parseInt(deque.pollLast());
                    deque.add(multiplyString(number, tempBuilder.toString()));
                }
            } else {
                deque.add(String.valueOf(inval.charAt(i)));
            }
        }
        return tempBuilder.toString();
    }


    public static String multiplyString(int number, String tempBuilder) {
        StringBuilder repeat = new StringBuilder();
        for(int j=1; j <= number; j++){
            repeat.append(tempBuilder);
        }
        return repeat.toString();
    }
}
