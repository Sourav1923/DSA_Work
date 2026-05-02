package com.M_SubSequence_SubSet;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
      ArrayList<String> subseq = subSeqRet("", "abc");
        System.out.println(subseq);
    }

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    //Returning through ArrayList

    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }

        ArrayList<String> left = subSeqRet(p+up.charAt(0), up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
