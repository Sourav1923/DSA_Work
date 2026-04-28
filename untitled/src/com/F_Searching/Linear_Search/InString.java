package com.F_Searching.Linear_Search;

public class InString {
    public static void main(String[] args) {
        String name = "Sourav";
        System.out.println(linearSearch(name, 'u'));

    }


    static boolean linearSearch(String st, char target){
        if(st.length()==0){
            return false;
        }
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i)==target)
                return true;
        }
        return false;
    }
}
