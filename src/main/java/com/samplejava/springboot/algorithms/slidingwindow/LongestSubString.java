package com.samplejava.springboot.algorithms.slidingwindow;

import java.util.HashMap;

public class LongestSubString {

    //Longest substring without repeating char
    public static void main(String args[]) {
        String example1 = "abcaobcbb";
        String example2 = "bbbbb";

        int length1 = lengthOfLongestSubstring(example1);
        int length2 = lengthOfLongestSubstring(example2);

        System.out.println("Example 1: " + example1);
        System.out.println("Longest Substring Length: " + length1);

        System.out.println("\nExample 2: " + example2);
        System.out.println("Longest Substring Length: " + length2);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            charIndexMap.put(currentChar, end);
        }

        return maxLength;
    }
}