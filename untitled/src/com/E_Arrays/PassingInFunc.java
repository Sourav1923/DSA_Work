package com.E_Arrays;

import java.util.Arrays;

public class PassingInFunc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        ChangeArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void ChangeArray(int[] a){
        a[0]=99;
    }
}
