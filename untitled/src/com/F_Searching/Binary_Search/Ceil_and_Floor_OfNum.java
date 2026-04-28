package com.F_Searching.Binary_Search;

public class Ceil_and_Floor_OfNum {
    public static void main(String[] args) {
        int arr[]= {1,4,6,7,10, 12, 18, 25, 29, 34, 55, 56, 58, 67,78,89,90, 102};
        //Array is not sort then
        //Arrays.sort(arr);
        try {
            int ceil = arr[ceil(arr, 103)];
            System.out.println("Ceil : "+ceil);
        }catch (Exception e){
            System.out.println("Ceil not found");
        }

        try {
            int floor = arr[floor(arr, 0)];
            System.out.println("Floor : "+floor);
        }catch (Exception e){
            System.out.println("Floor not found");
        }

    }
    //Return index
   // Ceiling : Smallest number greater or equal to target
    static int ceil(int []arr , int target){

        // But if target is greater than the greatest element in array
        if (target > arr[arr.length-1]) {
            return -1;
        }
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
        return start;
    }
    //Floor
    static int floor(int []arr , int target){
        //if target is smaller than the smallest in array
        if (target < arr[0]){
            return -1;
        }

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
        return end;
    }

}
