package com.K_Recursion;

public class Main {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n == 5) { //Base case
            System.out.println(n);
            return;
        }
        System.out.println(n);


        print(n+1); //Recursion : A function is calling itself-->Tail Recursion
    }
}
