package com.H_Strings.Strings_Builder;

public class Main {
    public static void main(String[] args) {

      /*  String letter = "";
        for (int i = 0; i < 26; i++) {
            char alphabet = (char) ('a'+i);
            letter += alphabet; // This create every time a new object like "a", "ab", "abc" ..... So not Efficient space
        }
        System.out.println(letter); */

        //Here's Come String Builder

        StringBuilder letter = new StringBuilder(""); //This is not immutable like String
        for (int i = 0; i < 26; i++) {
            char alphabet = (char) ('a' + i);
            letter.append(alphabet);
        }
        System.out.println(letter);
       //Some Methods of String Builder

        letter.deleteCharAt(0);
        System.out.println(letter);


    }
}
