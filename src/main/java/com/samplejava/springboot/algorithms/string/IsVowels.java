package com.samplejava.springboot.algorithms.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class IsVowels {

    public static void main(String args[]) {
        String input1 = "fazrudeen";
        System.out.println(isVowels(input1));
    }

    public static int isVowels(String stringValue) {
        Set<String> vowels = new HashSet<>(Arrays.asList("a","e", "i", "o", "u"));
        AtomicInteger s  = new AtomicInteger(0);
        for(int i = 0; i<stringValue.length(); i++){
            if(vowels.contains(String.valueOf(stringValue.charAt(i)))) {
                s.incrementAndGet();
            }
        }
        return 0;
    }
}