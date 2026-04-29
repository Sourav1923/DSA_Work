package com.K_Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 34, 45, 45, 1, 23};
        //System.out.println(findIndex(arr, 45, 0));
       // System.out.println(findIndexList(arr, 45, 0, new ArrayList<>()));
        System.out.println(findIndexList2(arr, 45, 0));
    }

    static boolean linearSearch(int arr[],int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || linearSearch(arr, target, index+1);
    }

    static int findIndex(int arr[],int target, int index){
        if(index == arr.length){
            return -1;
        }
        if (target == arr[index]){
            return index;
        }

        return findIndex(arr, target, index+1);
    }



    static ArrayList<Integer> findIndexList(int arr[],int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if (target == arr[index]){
           list.add(index);
        }
        return findIndexList(arr, target, index+1, list);
    }


    //No Arguments list

     static  ArrayList<Integer> findIndexList2(int arr[], int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(target == arr[index]){
            list.add(index);
        }

        //Answers from below recursion
         ArrayList<Integer> answerBelow = findIndexList2(arr, target, index+1);

        list.addAll(answerBelow);

        return list;
     }
}
