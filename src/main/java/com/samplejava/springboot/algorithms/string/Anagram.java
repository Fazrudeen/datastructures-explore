package com.samplejava.springboot.algorithms.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Anagram {

    public static void main(String args[]) {
        String input1 = "anagram";
        String input2 = "naagarm";
        System.out.println(isAnagram(input1, input2));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
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