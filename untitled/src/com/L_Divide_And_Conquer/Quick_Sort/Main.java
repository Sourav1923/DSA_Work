package com.L_Divide_And_Conquer.Quick_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1 ,8};

        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int arr[], int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot ){
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if(start <= end){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;

                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

}
