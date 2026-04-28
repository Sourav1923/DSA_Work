package com.H_Strings.Strings_Builder;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    static boolean isPalindrome(String str){
        if (str.length()==0 || str==null){
            return true;
        }
        str = str.toLowerCase();
        int start=0;
        int end=str.length()-1;

        while(start<=end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }

        return true;
    }
}
