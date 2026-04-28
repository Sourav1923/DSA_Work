package com.G_Sorting_Algorithm.Bubble_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 0, 5, 3};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static  void  bubbleSort (int arr[]){
        boolean swap = false;
        // Outer loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            // No swap
            if ( !swap ){
                break;
            }

        }
    }
}
