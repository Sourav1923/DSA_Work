package com.M_SubSequence_SubSet;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
       // dice("", 4);
//        System.out.println(diceRet("", 4));
        multiFaceDice("", 6, 7);
    }

    //Possible Ways to Achieve target
    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }

    //Return this using ArrayList
    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceRet(p+i, target-i));
        }

        return ans;
    }

    //MultiFace Dice
    static void multiFaceDice(String p, int target, int face){
        if(target==0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
          multiFaceDice(p+i, target-i, face);
        }
    }


}
