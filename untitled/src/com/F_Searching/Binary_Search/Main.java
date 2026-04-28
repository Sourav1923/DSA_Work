package com.F_Searching.Binary_Search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]= {1,4,6,7,10, 12, 18, 25, 29, 34, 55, 56, 58, 67,78,89,90, 102};
        //Array is not sort then
        //Arrays.sort(arr);
        System.out.println("Element Found at:"+binarySearch(arr, 10));

    }
    //Return index
    //If element not found then -1
    static int binarySearch(int []arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            /*int mid = (start+mid)/2; this is a way to find mid element but not best way because if it might possible
            that it exceed the range of integer datatype in Java .*/

            // Better Way
            int mid = start + (end - start)/2;

            if (target < arr[mid]){ //Left Side
                end = mid -1;
            }else if (target > arr[mid]){ //Right Side
                start = mid+ 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
