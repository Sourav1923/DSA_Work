package com.K_Recursion;

import jdk.jshell.execution.JdiDefaultExecutionControl;

public class digitProduct {
    public static void main(String[] args) {
        System.out.println(digitProd(501));
    }

    static int digitProd(int n){
        if(n%10==n){
            return n;
        }
        return digitProd(n/10)*n%10;
    }
}
