package com.samplejava.springboot.algorithms.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class longPre {

    public static void main(String[] args) {
        System.out.println(getSort(Arrays.asList("flower","flow","flight")));
    }

    public static String getSort(List<String> stringList) {
        Collections.sort(stringList);
        String firstEle = stringList.get(0);
        String lastEle = stringList.get(stringList.size() - 1);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<lastEle.length(); i++) {
            if(firstEle.charAt(i) == lastEle.charAt(i)) {
                stringBuilder.append(firstEle.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
