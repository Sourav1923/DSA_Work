package com.K_Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 3, 4};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int arr[], int i, int j){
        if(i==0){
            return;
        }

        if(j < i){
            if (arr[j] > arr[j+1]) {
                swap(arr, j);
            }
            bubbleSort(arr, i, j+1);
        }
        else {
            bubbleSort(arr, i - 1, 0);
        }

    }

    static void swap(int arr[], int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

}
