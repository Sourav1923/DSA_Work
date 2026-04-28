package com.D_Method;

public class Shadowing {
    static int a =50; // this shadowed at line no. 7
    public static void main(String[] args) {
        System.out.println(a);
        int a = 100; // shadowing the class variable
        System.out.println(a);
    }


}
