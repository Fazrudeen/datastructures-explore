package com.samplejava.springboot.algorithms;

public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(passwordValidation("Fazrudee@2023"));
    }

    private static Boolean passwordValidation(String input) {
        char[] charValue = input.toCharArray();
        boolean isValidLength;
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        if (charValue.length >= 8) {
            isValidLength = true;
        } else return false;

        for (char each : charValue) {
            if (Character.isDigit(each)) {
                hasDigit = true;
            } else if (Character.isUpperCase(each)) {
                hasUpper = true;
            } else if (Character.isLowerCase(each)) {
                hasLower = true;
            } else if (checkSpecial(each)) {
                hasSpecial = true;
            }
        }
        return isValidLength && hasDigit && hasLower && hasUpper;
    }

    private static boolean checkSpecial(char each) {
        int ascii = each;
        return (ascii > 34 && ascii < 45);
    }

}
