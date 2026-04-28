package com.F_Searching.Linear_Search;

import java.util.Arrays;

public class In2DArray {
    public static void main(String[] args) {
        int arr[][]= {
                {1, 2, 3},
                {2, 33, 43},
                {67, 86, 33}
        };
        System.out.println(Arrays.toString(linearSearch(arr, 33)));

    }

    static int[] linearSearch(int [][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]== target){
                    return new int[]{row, col};
                }
            }

        }

        return new int []{-1, -1};
    }



}
