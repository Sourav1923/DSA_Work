package com.F_Searching.Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr1[]= {1,4,6,7,10, 12, 18, 25, 29, 34, 55, 56, 58, 67,78,89,90, 102};
        int arr2[] ={90, 78, 54, 54, 43, 34, 26, 12, 5, 0};
        //Array is not sort then
        //Arrays.sort(arr);
        System.out.println("Element Found at:"+orderAgnosticBinarySearch(arr2, 54));


    }
    static  int orderAgnosticBinarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) { //Left Side
                    end = mid - 1;
                } else { //Right Side
                    start = mid + 1;
                }
            }
            else {
              if (target > arr[mid]) { //left Side
                end = mid - 1;
              } else { //right Side
                start = mid + 1;
              }
            }

        }
        return -1;
    }
}
