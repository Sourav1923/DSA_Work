package com.K_Recursion;

public class BinarySearch {
    public static void main(String[] args) {
       int arr[]={1, 2, 3, 4};
       int ans = binarySearch(arr, 3, 0, arr.length-1);
        System.out.println(ans);
    }

    static int binarySearch(int arr[], int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target > arr[mid]){
            return binarySearch(arr, target, mid+1, e);
        }
        return binarySearch(arr, target, s, mid-1);
    }
}
