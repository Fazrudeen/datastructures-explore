package com.samplejava.springboot.algorithms.collections;

import java.util.HashMap;
import java.util.Map;

public class DomainSearch {

    public static void main(String[] args){
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("google.com", 900);
        inputMap.put("mail.yahoo.com", 60);
        inputMap.put("mobile.sports.yahoo.com", 10);
        inputMap.put("sports.yahoo.com", 40);
        inputMap.put("yahoo.com", 300);
        inputMap.put("stackoverflow.com", 10);
        inputMap.put("overflow.com", 20);
        inputMap.put("com.com", 5);
        inputMap.put("en.wikipedia.org", 1);
        inputMap.put("mobile.sports", 1);
        inputMap.put("google.co.uk", 1);

        String name = "faz";
        float ddd =  (float) name.length()/2;
        System.out.println(getCommon(inputMap));
    }

    public static Map<String, Integer> getCommon( Map<String, Integer> inputMap) {
        Map<String, Integer> outMap = new HashMap<>();
        for(Map.Entry<String, Integer> eachValue: inputMap.entrySet()) {
            String[] keySplit = eachValue.getKey().split("\\.");
            String subDomain = "";
            for(int i = keySplit.length - 1; i >= 0; i--) {
                subDomain =  keySplit[i] + subDomain;
                if(outMap.containsKey(subDomain)) {
                    outMap.put(subDomain, outMap.get(subDomain) + eachValue.getValue());
                } else {
                    outMap.put(subDomain, eachValue.getValue());
                }
                if (i != 0) {
                    subDomain = "." + subDomain;
                }
            }
        }
        return outMap;
    }
}