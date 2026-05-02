package com.M_SubSequence_SubSet;

public class SkipSubString {
    public static void main(String[] args) {
//         skip("", "baccad");
//        System.out.println(skip2("baccad"));
//        System.out.println(skipApple("baccappled"));
        System.out.println(skipAppNotApple("baccappled"));
    }


    //Just Print the String
    static void skip(String pros, String unpros){
        if(unpros.isEmpty()){
            System.out.println(pros);
            return;
        }

        if(unpros.charAt(0)=='a'){
            skip(pros, unpros.substring(1));
        }else{
            skip(pros+unpros.charAt(0), unpros.substring(1));
        }
    }

    //Returning the String
    static String skip2(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if(ch == 'a'){
            return skip2(s.substring(1));
        }else {
            return ch+skip2(s.substring(1));
        }
    }

    //Skip A SubString

    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }else{
            return s.charAt(0)+skipApple(s.substring(1));
        }
    }
    // Skip only that substring not others

    static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        }else{
            return s.charAt(0)+skipAppNotApple(s.substring(1));
        }
    }
}
