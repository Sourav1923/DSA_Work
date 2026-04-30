package com.L_Divide_And_Conquer.Merge_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
          int arr[] = {2, 4, 3, 6, 1};
          int ans[] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int rigth[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, rigth);
    }

    static int[] merge(int first[], int second[]){
        int mix[] = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k]= first[i];
                i++;
            }else {
                mix[k]= second[j];
                j++;
            }
            k++;
        }

        // It is may be possible that one of the array is not complete

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

}
