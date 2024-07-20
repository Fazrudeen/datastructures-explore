package com.samplejava.springboot.algorithms;

public class CommonHacks {

    public static void main(String[] args) {
        System.out.println(commonHacks());
    }

    public static boolean commonHacks() {

        // iterate string
        String myString = "Hello";
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            System.out.println(c);
        }

        // iterate string in reverse
        for (int i = myString.length() - 1; i >= 0; i--) {
            char c = myString.charAt(i);
            System.out.println(c);
        }

        // Iterate over each character (digit) in the string

        int number = 374323; // Your example number
        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            System.out.println("Digit at position " + (i+1) + ": " + digit);
        }

        return true;
    }
}
