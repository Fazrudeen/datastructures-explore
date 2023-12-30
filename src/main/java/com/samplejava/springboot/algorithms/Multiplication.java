package com.samplejava.springboot.algorithms;

public class Multiplication {

    public static void main(String[] args) {
        System.out.println(calculateString("31*2+3+2*1"));
    }

    public static Integer calculateString(String string) {
        String[] trimmedString = string.trim().split("\\+");
        int forAddition = 0;
        for(int i =0; i < trimmedString.length; i++) {
            String[] multiplySplit = trimmedString[i].trim().split("\\*");
            int multiplyResult = 1;
            for(int j =0; j < multiplySplit.length; j++) {
                multiplyResult *= Integer.parseInt(multiplySplit[j]);
            }
            forAddition += multiplyResult;
        }
        return forAddition;
    }
}
