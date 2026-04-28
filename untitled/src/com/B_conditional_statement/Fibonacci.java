package com.B_conditional_statement;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < n ; i++){
            System.out.print(a+" ");
            int temp = b;
         b= a+b;
         a=temp;


          }


    }
}
