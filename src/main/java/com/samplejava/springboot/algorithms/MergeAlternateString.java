package com.samplejava.springboot.algorithms;

import java.util.HashSet;
import java.util.Set;

public class MergeAlternateString {

//    Input: word1 = "abc", word2 = "pqr"
//    Output: "apbqcr"

//    Input: str1 = "ABABAB", str2 = "ABAB"
//    Output: "AB"

    public static void main(String[] args) {
        System.out.println(mergeString("abc",  "pqrs"));
        System.out.println(commonString("ABCABC",  "ABC"));
    }

    public static String mergeString(String A, String B) {
        int s1Length = A.length();
        int s2Length = B.length();
        int iterateLength = (s1Length > s2Length) ? s1Length  :  s2Length;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < iterateLength; i++) {
            if(i < s1Length) {
                stringBuilder.append(A.charAt(i));
            }
            if(i < s2Length) {
                stringBuilder.append(B.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String commonString(String A, String B) {
        int s2Length = B.length();
        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s2Length; i++) {
            if (B.charAt(i) == A.charAt(i)) {
                set.add(A.charAt(i));
            }
        }
        set.forEach( x -> {
            stringBuilder.append(x);
        });
        return stringBuilder.toString();
    }
}