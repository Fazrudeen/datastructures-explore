package com.samplejava.springboot.algorithms.string;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Permutation  extends ClassLoader {

    public static void main(String[] args) {
        String one = "abc";
        String two = "bei";
        System.out.println(getPermutation(one, two));
    }

    public static Boolean getPermutation(String one, String two) {
        char[] oneChar = one.toCharArray();
        char[] twoChar = two.toCharArray();
        if (oneChar.length > twoChar.length) {
            return false;
        }
        Map<Character, Integer> oneCount =  getCountMap(oneChar);
        Map<Character, Integer> twoCount =  getCountMap(twoChar);
        if (oneCount.equals(twoCount)) {
            return true;
        }
        for(int i =0; i< twoChar.length; i++) {
            if(isContains(oneChar, twoChar[i])) {
                Boolean match = isMatch(oneChar, Arrays.copyOfRange(twoChar, i, i + oneChar.length));
                if (match) return true;
            }
        }
        return false;
    }

    private static Map<Character, Integer> getCountMap(char[] input) {
        Map<Character, Integer> hashmap = new HashMap<>();
        for (char each : input) {
            if (hashmap.containsKey(each)) {
                hashmap.put(each, hashmap.get(each) + 1);
            } else hashmap.put(each, 1);
        }
        return hashmap;
    }

    private static Boolean isContains(char[] input, char value) {
        for (char each : input) {
            if (each == value) {
                return true;
            }
        }
        return false;
    }

    private static Boolean isMatch(char[] input, char[] input2) {
        Arrays.sort(input2);
        return Arrays.equals(input, input2);
    }
}
