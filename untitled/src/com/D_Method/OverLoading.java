package com.D_Method;

public class OverLoading {
    public static void main(String[] args) {
        fun(2);
        fun("Sourav");
        fun(2,3);

        //At method overloading which func to be called decide by the argument needed by the func
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

    static void fun(int a, int b){
        System.out.println(a+b);
    }

}
