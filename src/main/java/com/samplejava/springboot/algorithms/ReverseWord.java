package com.samplejava.springboot.algorithms;

import java.util.List;

public class ReverseWord {

    public static void main(String[] args){
        String s = "the sky is blue";
        List<String> strings = List.of(s.split("\\s"));
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = strings.size() - 1; i >=0; i-- ) {
            stringBuilder.append(strings.get(i));
            if (i != 0) stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }

}