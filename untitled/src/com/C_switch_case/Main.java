package com.C_switch_case;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fruit = new Scanner(System.in).next();
        // Old format
        /*switch (fruit){
            case "Mango":
                System.out.println("King Of fruit");
                break;
            case "Apple":
                System.out.println("Sweet red fruit");
                break;
            case "Banana":
                System.out.println("Full of Potassium");
                break;
            case "Grapes":
                System.out.println("Juicy Green Barry");
                break;
            default:
                System.out.println("Please Enter a Valid fruit");
        }*/

        //New Format
        switch (fruit) {
            case "Mango" -> System.out.println("King Of fruit"); //No need to break statement
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Banana" -> System.out.println("Full of Potassium");
            case "Grapes" -> System.out.println("Juicy Green Barry");
            default -> System.out.println("Please Enter a Valid fruit");
        }
    }
}
