package com.K_Recursion;

public class NtoOne {
    public static void main(String[] args) {
        //funcNtoOne(5);

       // funcOnetoN(5);

        funcBoth(5);
    }

    static void funcNtoOne(int n){
        if(n==0)
            return;

        System.out.println(n);
        funcNtoOne(n-1);
    }

    static void funcOnetoN(int n){
        if(n==0) {
            return;
        }
        funcOnetoN(n-1);
        System.out.println(n);
    }

    static void funcBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);

    }

}
