package com.samplejava.springboot.algorithms.slidingwindow;

public class GetSubString {

    public static void main(String args[]) {
        System.out.println(getNeedle());
    }

    public static Integer getNeedle( ){
        String haystack = "sadbutsad";
        String needle = "but";
        Integer haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength > haystackLength || needle.isBlank()) {
            return -1;
        }

        for(int i=0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, needleLength).equals(needle)) {
                return 1;
            }
            needleLength++;
        }
        return -1;
    }
}
