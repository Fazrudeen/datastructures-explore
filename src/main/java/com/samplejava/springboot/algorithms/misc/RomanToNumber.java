package com.samplejava.springboot.algorithms.misc;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

    public static void main(String args[]) {
        System.out.println(
                roamToNum("II"));
    }

    public static Integer roamToNum(String input){
        Map<Character, Integer> mapValue = new HashMap<>();
        mapValue.put('I', 1);
        mapValue.put('V', 5);
        mapValue.put('X', 10);
        mapValue.put('L', 50);
        mapValue.put('C', 100);
        mapValue.put('D', 500);
        mapValue.put('M', 1000);

        Integer previousValue = 0;
        int result = 0;
        for(int i = input.length()-1; i >= 0; i--) {
           char currentString = input.charAt(i);
           Integer currentValue = mapValue.get(currentString);
           if (currentValue >= previousValue) {
               result = result + currentValue;
           } else {
               result = result - currentValue;
           }
           previousValue = currentValue;
        }
        return result;

    }
}




