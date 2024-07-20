package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDictionary {

    public static void main(String[] args) {
        String input = "applepenapple";
        List<String> wordDict = new ArrayList<>(Arrays.asList("apple","pen"));
        System.out.println(checkWord(input, wordDict ));
    }

    private static Boolean checkWord(String input, List<String> wordDict ) {
        char[] stringChar = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char each: stringChar) {
            stringBuilder.append(each);
            if(wordDict.contains(stringBuilder.toString())) {
                int length = stringBuilder.length();
                stringBuilder.delete(0, length);
            }
        }
        return stringBuilder.isEmpty();
    }
}




