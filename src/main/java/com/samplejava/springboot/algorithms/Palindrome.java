package com.samplejava.springboot.algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hibernate.internal.util.collections.CollectionHelper.listOf;

public class Palindrome {

    public static void main(String[] args) {
//        System.out.println(palindrome());
        System.out.println(palindrome1("NOON"));

    }

    private static Map<String, Boolean> palindrome() {
        List<String> input = listOf("MADAM", "NON", "DAD1");
        Map<String, Boolean> result = new HashMap<>();
        input.forEach( x -> {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i= x.length()-1; i >= 0; i--) {
                stringBuilder.append(x.charAt(i));
            }
            result.put(x, x.equals(stringBuilder.toString()));
        });

        return result;
    }

    public static Boolean palindrome1(String value) {
        int size = Math.round((float) value.length() / 2);
        String comp = value.substring(0, size);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = value.length() - 1; i >= size-1; i-- ) {
            stringBuilder.append(value.charAt(i));
        }
        return comp.equals(stringBuilder.toString());
    }
}


