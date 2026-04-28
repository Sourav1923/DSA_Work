package com.K_Recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(1234));
    }

    static int digitSum(int n){
        if(n==0){
            return 0;
        }

        return digitSum(n/10)+n%10;
    }

}
