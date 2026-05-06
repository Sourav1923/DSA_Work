package com.N_Backtracking;

import java.util.ArrayList;

public class MazzeProblem {
    public static void main(String[] args) {
       // System.out.println(mazzePathCount(3,3));
       // mazzePaths("", 3, 3);
        //System.out.println(mazzePathsRet("", 3, 3));
       // mazzePathsDiag("", 3, 3);
        boolean mazze[][] = {{true, true, true},
                             {true, false, true},
                             {true, true, true}};

        mazzeRetriction("", mazze, 0, 0);
    }

    //Possible Path Count
    static int mazzePathCount(int row, int col){
        if (row == 1 || col==1){
            return 1;
        }
        int right = mazzePathCount(row, col-1);
        int down = mazzePathCount(row-1, col);
        return right+down;
    }

    //Possible Path Print
    static void mazzePaths(String p, int row, int col){
        if (row==1 && col==1){
            System.out.println(p);
            return;
        }
        //Down
        if(row > 1){
            mazzePaths(p+"D", row-1, col );
        }
        //Right
        if (col > 1){
            mazzePaths(p+"R", row, col-1);
        }
    }

    //Return Path
    static ArrayList<String> mazzePathsRet(String p, int row, int col){
        if (row==1 && col==1){
           ArrayList<String > list = new ArrayList<>();
           list.add(p);
           return list;
        }

        ArrayList<String> ans =new ArrayList<>();

        //Down
        if(row > 1){
            ans.addAll(mazzePathsRet(p+"D", row-1, col ));
        }
        //Right
        if (col > 1){
           ans.addAll(mazzePathsRet(p+"R", row, col-1));
        }

        return ans;
    }

    //Diagonal Movement
    static void mazzePathsDiag(String p, int row, int col){
        if (row==1 && col==1){
            System.out.println(p);
            return;
        }

        //Diagonal
        if(row > 1 && col > 1){
            mazzePathsDiag(p+"D", row-1, col-1 );
        }

        //Vertical
        if(row > 1){
            mazzePathsDiag(p+"V", row-1, col );
        }
        //Horizontal
        if (col > 1){
            mazzePathsDiag(p+"H", row, col-1);
        }
    }
//Maze With Restriction(Obstacles)
    static void mazzeRetriction(String p, boolean mazze[][], int row, int col){
        if (row==mazze.length-1 && col==mazze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!mazze[row][col]){
            return;
        }
        //Down
        if(row < mazze.length-1){
            mazzeRetriction(p+"D", mazze,row+1, col );
        }
        //Right
        if (col < mazze[0].length-1){
            mazzeRetriction(p+"R", mazze, row, col+1);
        }
    }




}
