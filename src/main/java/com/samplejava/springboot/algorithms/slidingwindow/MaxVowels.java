package com.samplejava.springboot.algorithms.slidingwindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxVowels {

    public static void main(String args[]) {
        System.out.println(maxVowels( "abciiidef", 3));
        System.out.println(maxVowels( "aeiou", 2));
        System.out.println(maxVowels( "leetcode", 3));
    }

    public static int maxVowels(String input, int subVal){
        int maxVowels = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i=0; i <= input.length() - subVal; i++) {
            String currentSub = input.substring(i, i + subVal);
            int currentCount = 0;
            for(int j=0; j < currentSub.length(); j++) {
                if(vowels.contains(currentSub.charAt(j))){
                    currentCount = currentCount + 1;
                }
            }
            maxVowels = currentCount;
            if(maxVowels == subVal ) {
                return maxVowels;
            }
        }
        return maxVowels;
    }
}
