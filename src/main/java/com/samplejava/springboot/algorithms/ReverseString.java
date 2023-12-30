package com.samplejava.springboot.algorithms;

public class ReverseString {

    public static void main(String args[]) {
        System.out.println(reverseString("Fazrudeen"));
    }

    public static String reverseString(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        int stringLength = name.length();
        for(int i = stringLength -1; i >=0; i-- ) {
            stringBuilder.append(name.charAt(i));
        }
        return stringBuilder.toString();
    }
}
