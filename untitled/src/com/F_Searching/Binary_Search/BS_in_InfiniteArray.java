package com.F_Searching.Binary_Search;

public class BS_in_InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {
                1, 3, 5, 7, 9, 12, 15, 18, 21, 25,
                29, 34, 38, 42, 47, 51, 56, 60, 65, 70,
                75, 80, 85, 90, 95, 100, 105, 110, 115, 120,
                125, 130, 135, 140, 145, 150, 155, 160, 165, 170,
                175, 180, 185, 190, 195, 200, 205, 210, 215, 220,
                225, 230, 235, 240, 245, 250, 255, 260, 265, 270,
                275, 280, 285, 290, 295, 300, 305, 310, 315, 320,
                325, 330, 335, 340, 345, 350, 355, 360, 365, 370,
                375, 380, 385, 390, 395, 400, 405, 410, 415, 420,
                425, 430, 435, 440, 445, 450, 455, 460, 465, 470 //........infinite terms
        }; //It might be infinite
       int pos= ans(arr, 1);

        System.out.println(pos);
    }

    static int ans(int []arr, int target){
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int newStart = end+1;
            //end = end + windowSize*2
            end = end +(end-start+1)*2;
            start = newStart;
        }
       int ans= binarySearch(arr, target, start, end);
        return ans;
    }

    //Return index
    //If element not found then -1
    static int binarySearch(int []arr , int target, int start, int end){

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



