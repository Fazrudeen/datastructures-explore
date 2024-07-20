package com.samplejava.springboot.algorithms.misc;

public class Factorial {

    public static void main(String[] args) {
//        System.out.println(getFactorial(5));
        System.out.println(getFactorialRecursion(5));
    }

    private static Integer getFactorial(Integer number) {
        int baseValue = 1;
        for(int i=1; i<=number; i++) {
            baseValue= multiply(baseValue, i);
        }
        return baseValue;
    }

    private static Integer multiply(Integer value1, Integer value2) {
        return value1 * value2;
    }

    private static Integer getFactorialRecursion(Integer n ) {
        if (n ==1) {
            return 1;
        } else {
            return n * getFactorialRecursion(n - 1);
        }
    }
}
