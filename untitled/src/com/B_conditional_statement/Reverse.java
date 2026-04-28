package com.B_conditional_statement;

public class Reverse {
    public static void main(String[] args) {
        int n = 23934;
        int rev = 0;
        while (n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
        }

        System.out.println("reverse no. is "+rev);
    }
}
