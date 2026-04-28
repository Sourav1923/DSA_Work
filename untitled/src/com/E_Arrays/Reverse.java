package com.E_Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        reverse(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[], int start, int end){
        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1]= arr[idx2];
        arr[idx2]= temp;
    }
}
