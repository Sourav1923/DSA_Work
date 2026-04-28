package com.F_Searching.Binary_Search;

public class NoOfRotationInArr {
    public static void main(String[] args) {
        int arr []= {4, 5, 6, 7, 0, 1, 2};
        System.out.println("No. of Rotation on Array : "+(findPivot(arr)+1));
    }

    static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if (arr[start]==arr[mid] && arr[end]==arr[mid]) {
                if(start< end && arr[start]>arr[start+1]){
                    return start;
                }
                if (end > start && arr[end] < arr[end-1]) {
                    return end-1;
                }
                start++;
                end--;
            } else if (arr[start] < arr[mid] || ((arr[start]==arr[mid]) && arr[mid] > arr[end])) {
                 start = mid+1;
            } else{
                end = mid -1;
            }
        }
        return -1;
    }

}
