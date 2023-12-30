package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubString {

    public static void main(String args[]) {
        String example1 = "abcabcbb";
        String example2 = "bbbbb";

        int length1 = lengthOfLongestSubstring(example1);
        int length2 = lengthOfLongestSubstring(example2);

        System.out.println("Example 1: " + example1);
        System.out.println("Longest Substring Length: " + length1);

        System.out.println("\nExample 2: " + example2);
        System.out.println("Longest Substring Length: " + length2);
    }

    public static int lengthOfLongestSubstring(String s) {

        List aaa = new ArrayList<>();
        aaa.add(1);
        aaa.add("dd");
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the substring, update the start index
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            // Update the maximum length if needed
            maxLength = Math.max(maxLength, end - start + 1);

            // Update the index of the current character
            charIndexMap.put(currentChar, end);
        }

        return maxLength;
    }
}