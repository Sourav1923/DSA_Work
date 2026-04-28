package com.E_Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        swap(arr, 0 , 4);
        System.out.println(Arrays.toString(arr));
    }

   static void swap(int []arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1]= arr[idx2];
        arr[idx2]= temp;
    }
}
