package com.K_Recursion;

public class ZeroCount {
    public static void main(String[] args) {
        System.out.println(zeroCount(1002030));
    }

    static int zeroCount(int n){

        int count = 0;
        return helper(n, count);
    }

    static int helper(int n, int count){
        if(n==0){
            return count;
        }

        if(n%10==0){
            count++;
        }

        return helper(n/10, count);
    }
}
