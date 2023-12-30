package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectingStrings {

    public static void main(String args[]) {

        String[] input = { "1p3acres", "is", "a", "good", "place", "to", "communicate" };
        int length = 12;
        System.out.println(connectingString(input, length));
    }

    public static List<String> connectingString(String[] input,int input2) {
        List<String> lines = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        for(String word : input) {
            if (currentLine.length() == 0) {
                currentLine.append(word);
            } else {
                // Check if adding the next word exceeds the maxLength
                if (currentLine.length() + 1 + word.length() <= input2) {
                    currentLine.append("-").append(word);
                } else {
                    lines.add(currentLine.toString());
                    currentLine = new StringBuilder(word);
                }
            }

        }

        if (currentLine.length() > 0) {
            lines.add(currentLine.toString());
        }

        return lines;
    }
}
