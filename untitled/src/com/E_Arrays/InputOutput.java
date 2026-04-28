package com.E_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0]=23;
//        arr[1]=23;
//        arr[2]=23;
//        arr[3]=23;
//        arr[4]=23;

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Or for direct
        System.out.println(Arrays.toString(arr));

        //For Each Loop
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
