//package com.samplejava.springboot.algorithms;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//public class PartitionArray {
//
//    public static void main(String[] args) {
//        List<Integer> one = new ArrayList<>(Arrays.asList(8,3,6,1,7,3));
//        partitionArray(one);
//    }
//
//    public static void partitionArray(List<Integer> one) {
//       Long count = one.stream().collect(Collectors.counting());
//       if(count % 2 != 0) {
//           System.out.println("it can not be partition");
//       }
//       Long eachCount = count / 2;
//
//
//    }
//
//}
