package com.B_conditional_statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int salary = new Scanner(System.in).nextInt();
        if (salary > 10000) {
            salary += 2000;// salary = salary+2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
