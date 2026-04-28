package com.E_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        //Adding Element
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
        //Update
       // list.set(0, 99);
        //Delete
       // list.remove(2);
        //Contains
        //System.out.println(list.contains(8));
        //input
        for (int i = 0; i < 5 ; i++) {
            int x=sc.nextInt();
            list.add(x);
        }
        //Output
        //Single Element
        System.out.println(list.get(0));
        //Whole lis
        System.out.println(list);
        //or
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }


    }
}
