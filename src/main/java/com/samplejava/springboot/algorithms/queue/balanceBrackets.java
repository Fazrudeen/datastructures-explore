package com.samplejava.springboot.algorithms.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class balanceBrackets {

    public static void main(String[] args) {
        System.out.println(balancedBrackets("{{([])}"));
    }

    private static boolean balancedBrackets(String input) {
        List<Character> closing = new ArrayList<>(Arrays.asList(']',')','}'));
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< input.length(); i++) {
            if (!closing.contains(input.charAt(i))) {
                stack.push(input.charAt(i));
            } else {
                char current = stack.pop();
                if (current == '[' && (input.charAt(i) == ')' || input.charAt(i) == '}')) {
                   return false;
                } else if (current == '(' && (input.charAt(i) == ']' || input.charAt(i) == '}')) {
                    return false;
                } else if (current == '{' && (input.charAt(i) == ']' || input.charAt(i) == ')')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

