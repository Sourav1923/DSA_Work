package com.M_SubSequence_SubSet;

import java.util.ArrayList;

public class PermutationSeq {
    public static void main(String[] args) {
//     permutatedSeq("", "abc");
 //       System.out.println(permutationSeqRet("", "abc"));

        System.out.println(permutationCount("", "abc"));
    }
    //Just Printing

    static int count = 0;
    static void permutatedSeq(String p, String up){
        if (up.isEmpty()){
            count++;
            System.out.println(count+". "+p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i < p.length()+1; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            permutatedSeq(first+ch+second, up.substring(1));
        }
    }

    //Returning through ArrayList

    static ArrayList<String> permutationSeqRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < p.length()+1; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationSeqRet(first+ch+second, up.substring(1)));
        }

        return ans;
    }
//Just count the number of permutation
    static int permutationCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i < p.length()+1; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            count = count+permutationCount(first+ch+second, up.substring(1));
        }

        return count;
    }


}
