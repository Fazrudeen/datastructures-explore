package com.samplejava.springboot.algorithms;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(isomorphicString("egg", "add"));
        System.out.println(isomorphicString("foo", "bar"));
        System.out.println(isomorphicString("paper", "title"));
    }

    public static boolean isomorphicString(String input1, String input2) {
        if (input1.length() != input2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] input1Char = input1.toCharArray();
        for(int i=0; i < input1Char.length; i++){
            if(map.containsKey(input1Char[i])){
                stringBuilder.append(map.get(input1Char[i]));
            } else {
                map.put(input1Char[i], input2.charAt(i));
                stringBuilder.append(input2.charAt(i));
            }
        }
        return stringBuilder.toString().equals(input2);
    }
}
