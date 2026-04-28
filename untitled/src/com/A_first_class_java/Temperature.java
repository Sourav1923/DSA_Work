package com.A_first_class_java;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Temp in Celc");
        float tempC = sc.nextFloat();
        System.out.println("Temp in Faranite "+((tempC*9/5)+32));
    }
}
