package com.B_conditional_statement;

public class OccuranceOfDigit {
    public static void main(String[] args) {
        int n = 23231;
        int digitTobeFind= 2;
        int count = 0;
        while (n!=0){
            int digit = n%10;
            if(digit==digitTobeFind){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
