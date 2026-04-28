package com.G_Sorting_Algorithm.Selection_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 0, 5, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-1-i;
            int maxIndex = findMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    static  int  findMaxIndex(int arr[], int start, int end){
        int maxIdx = start;
        for (int i = start; i <= end; i++) {
           if( arr[maxIdx] < arr[i]) {
               maxIdx = i;
           }
        }
        return maxIdx;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}


