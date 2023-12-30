package com.samplejava.springboot.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckClosedIteration {

    public static void main(String[] args) {
        System.out.println(closedIteration());
    }

    private static boolean closedIteration() {
        char[] charArray = "{[()]}".toCharArray();
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(') {
                deque.add(charArray[i]);
            } else {
                if (deque.isEmpty()) {
                    return false;
                }
                char polled = deque.pollLast();
                if (polled == '(' && (charArray[i] == '}' || charArray[i] == ']')) {
                    return false;
                } else if (polled == '{' && (charArray[i] == ')' || charArray[i] == ']')) {
                    return false;
                } else if (polled == '[' && (charArray[i] == ')' || charArray[i] == '}')) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}