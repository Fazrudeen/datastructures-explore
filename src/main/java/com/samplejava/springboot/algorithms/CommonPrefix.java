package com.samplejava.springboot.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonPrefix {

    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>(Arrays.asList("Flight","Flow","Flower"));
        System.out.println(findCommonString(arrayList));
    }

    public static String findCommonString(List<String> arrayList) {
        if (arrayList.size() == 0) return "";
        Collections.sort(arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        String lastString = arrayList.get(arrayList.size() - 1);
        for(int i=0; i < lastString.length() - 1; i++ ) {
            if(arrayList.get(0).charAt(i) == lastString.charAt(i) ) {
                stringBuilder.append(lastString.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}