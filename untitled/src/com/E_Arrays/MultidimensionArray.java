package com.E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  1 2 3
            4 5 6
            7 8 9
        */

        int [][] arr = new int[3][];

        int [][] arr2D = {{1,2,3},
                          {4,5},
                          {9,9,9,9}};

        // input

        int [][] num = new int[3][2];

        // num.length --> give no, of rows

        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                num[row][col]=sc.nextInt();
            }
        }

        //Output
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                System.out.print(num[row][col]+" ");
            }
            System.out.println();
        }

       // or Like this

        for (int row = 0; row < num.length; row++) {
            System.out.println(Arrays.toString(num[row]));
        }

        // by For Each

        for (int[] a: num){
            System.out.println(Arrays.toString(a));
        }

    }
}
