package com.K_Recursion;

import java.util.Arrays;

import static com.K_Recursion.BubbleSort.swap;

public class SelectionSort {
    public static void main(String[] args) {
      int arr[] = {9, 5, 3, 8, 1};
      selectionSort(arr, arr.length, 0, 0 );

        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[], int i, int j, int max){
        if(i == 0){
            return;
        }
        if(j < i){
            if(arr[j]> arr[max]){
                selectionSort(arr, i, j+1, j);
            }
            else {
                selectionSort(arr, i, j+1, max);
            }
        }else {
            swap(arr, max, i-1);
            selectionSort(arr, i-1, 0, 0);
        }
    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
