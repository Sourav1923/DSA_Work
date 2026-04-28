package com.H_Strings.Strings;

public class Main {
    public static void main(String[] args) {
        String name = "Sourav Mahapatra";
        System.out.println(name);

        //String Comparison

        String a = "Sourav";
        String b = "Sourav";
        System.out.println(a==b); // --> Give Because both ref variable pointing to the same Object in String pool in heap

        String name1 = new String("Sourav");
        String name2 = new String("Sourav");

        System.out.println(name1 == name2); // Give false because the two ref variables are pointing to diff object in diff
                                            // String pool in Heap
        //USE .equals() to compare only values

        System.out.println(name1.equals(name2));


       //String Concat

        System.out.println('a'+'b'); // These are characters it will change to it's Unicode when We use any Operator
        System.out.println("a"+"b"); //These are diff strings and just concatenate
        System.out.println("a"+1);// 1 changes to its wrapper class and uses toString method to concate with String
        System.out.println("a"+new Integer(2));

    }
}
