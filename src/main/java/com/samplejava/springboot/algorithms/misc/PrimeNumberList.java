package com.samplejava.springboot.algorithms.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberList {

    public static void main(String[] args) {
        System.out.println(getPrimeNumbers(100));
    }

    private static List<Integer> getPrimeNumbers(Integer number) {
        List<Integer> numbers = IntStream.range(1, number).boxed().toList();
        List<Integer> outList = new ArrayList<>();
        for(Integer each: numbers) {
            boolean isPrime = true;
            if(each < 2){
                isPrime = false;
            } else {
                for (int i = 2; i < each; i++) {
                    if (each % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime) {
                outList.add(each);
            }
        }
        return outList;
    }
}
