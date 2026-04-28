package com.D_Method;

public class PrimeNo {

    public static void main(String[] args) {
       boolean t= isPrime(7);
        System.out.println(t);


    }
    static boolean isPrime (int n){
        if(n <=1){
            return false;
        }
        int c =2 ;

        while (c*c<=n){
            if(n%c == 0){
                return false;
            }
            c++;
        }

        if(c*c > n){
            return  true;
        }
        return false;
    }
}
