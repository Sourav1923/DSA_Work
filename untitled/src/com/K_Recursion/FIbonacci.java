package com.K_Recursion;

public class FIbonacci {
    public static void main(String[] args) {
       int ans= fibonacci(3);
        System.out.println(ans);
    }
    static int fibonacci(int n){
//        if(n==0){
//            return 0;
//        }
//        if (n==1){
//            return 1;
//        }

        //Base Condition
        if(n<2){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

}
