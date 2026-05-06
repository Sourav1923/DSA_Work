package com.N_Backtracking;

import java.util.Arrays;

public class BackTracking_MazzeAnyDirection {
    public static void main(String[] args) {
         boolean mazze[][] = {{true, true, true},
                              {true, true, true},
                              {true, true, true}};
        int path[][] = {{0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}};
        mazzePathAndMovement(mazze, "", 0, 0, path, 1);


//         mazzeAnyDir(mazze, "", 0, 0);
    }

    static void mazzeAnyDir(boolean mazze[][],String movememt, int row, int col){
        if (row== mazze.length-1 && col == mazze[0].length-1){
            System.out.println(movememt);
            return;
        }

        if(mazze[row][col] == false){
            return;
        }

        mazze[row][col]=false;

        //Up Move
        if(row>0){
            mazzeAnyDir(mazze, movememt+"U", row-1, col);
        }
        //Down Move
        if(row<mazze.length-1){
            mazzeAnyDir(mazze, movememt+"D", row+1, col);
        }
        //Left Move
        if(col > 0){
            mazzeAnyDir(mazze, movememt+"L", row, col-1);
        }
        //Right Move
        if (col < mazze[0].length-1){
            mazzeAnyDir(mazze, movememt+"R", row, col+1);
        }

        //Now All recursive function is backed( Returned )
        //Restore there changes ---> Backtracking

        mazze[row][col] = true;

    }

    //Print Movement and Path Both
    static int count = 0;
    static void mazzePathAndMovement(boolean mazze[][],String movement, int row, int col, int path[][], int step){
        if (row== mazze.length-1 && col == mazze[0].length-1){
            count++;
            path[row][col] = step;
            System.out.println(count);
            System.out.println("Path: ");
            for (int i = 0; i < path.length; i++) {
                for (int j = 0; j < path[i].length; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("movement :"+movement);
            return;
        }

        if(mazze[row][col] == false){
            return;
        }

        mazze[row][col]=false;
        path[row][col]=step;

        //Up Move
        if(row>0){
            mazzePathAndMovement(mazze, movement+"U", row-1, col, path, step+1 );
        }
        //Down Move
        if(row<mazze.length-1){
            mazzePathAndMovement(mazze, movement+"D", row+1, col, path, step+1);
        }
        //Left Move
        if(col > 0){
            mazzePathAndMovement(mazze, movement+"L", row, col-1, path, step+1);
        }
        //Right Move
        if (col < mazze[0].length-1){
            mazzePathAndMovement(mazze, movement+"R", row, col+1, path, step+1);
        }

        //Now All recursive function is backed( Returned )
        //Restore there changes ---> Backtracking

        mazze[row][col] = true;
        path[row][col]=0;

    }

}
