package com.K_Recursion;

public class ReverseDigit {
    public static void main(String[] args) {
//      revDig(512);
//        System.out.println(sum);

        System.out.println(revDig(123));
    }

//    static int sum = 0;
//    static void revDig(int n){
//        if(n==0){
//            return;
//        }
//        sum = sum*10+n%10;
//
//        revDig(n/10);
//
//    }

    static int revDig(int n){
        int digit = (int)(Math.log10(n))+1;

        return helper(n, digit);
    }

    static int helper(int n, int base){
        if(n%10 == n){
            return n;
        }

        return (n%10)*(int)(Math.pow(10, base-1))+helper(n/10, base-1);
    }

}
