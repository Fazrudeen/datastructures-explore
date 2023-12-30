package com.samplejava.springboot.algorithms;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {

    public static void main(String[] args) {
        System.out.println(isSudoku());
    }

    public static Boolean isSudoku() {
        int[][] twoDimMatrix = {
                {2, 3, 1},
                {1, 2, 3},
                {3, 1, 2},
        };
        for(int i=0; i < twoDimMatrix.length; i++){
            Set<Integer> row = new HashSet<>();
            Set<Integer> column = new HashSet<>();
            for(int j=0; j < twoDimMatrix.length; j++) {
                boolean rowDup = row.add(twoDimMatrix[i][j]);
                boolean columDup = column.add(twoDimMatrix[j][i]);
                if (!rowDup || ! columDup) {
                    return false;
                }
            }
        }

        return true;
    }

}