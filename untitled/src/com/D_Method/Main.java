package com.D_Method;

import java.util.Scanner;

public class Main {
    /* Structure of methods
    access_modifier(OOPs) static/non_static(OOPs) return_type name (arguments){
       // body

       return --
    }
    */
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1St No.");
        int a = sc.nextInt();
        System.out.println("Enter 2ND No.");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum is : "+sum);
    }

    static int mul(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1St No.");
        int a = sc.nextInt();
        System.out.println("Enter 2ND No.");
        int b = sc.nextInt();

        return a*b;
    }

    static float div(int a, int b){

        return a/b;

    }
    private static String myGreeting() {

        return "Thanks";
    }

    public static void main(String[] args) {
        sum();
        int ansOfMul = mul();
        System.out.println("Multiplication ans is "+ansOfMul);
        float ansOfDiv = div(3, 4);
        System.out.println("Division of 3 & 4 is "+ansOfDiv);
        String greeting = myGreeting();
        System.out.println(greeting);
    }


}
