package com.N_Backtracking;

public class NQueen {
    public static void main(String[] args) {
      int n = 5;
      boolean board[][] = new boolean[n][n];
        System.out.println(nQueen(board, 0));
    }
    static int nQueen (boolean board[][], int row){
        if(row==board.length){
            display(board);
            return 1;
        }

        int count = 0;
        //Placing queen and checking it's position is safe
        for (int col = 0; col < board.length; col++) {
            //checking
            if (isSafe(board, row, col)){
                board[row][col]=true;
                count += nQueen(board, row+1);
                board[row][col]= false;
            }
        }

        return count;
    }

    static void display(boolean board[][]){
        for(boolean[] row: board){
            for (boolean element: row){
                if (element){
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }


    static boolean isSafe(boolean board[][], int row, int col){
       //vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        //diagonal left
        int limitLeft = Math.min(row, col);
        for (int i = 1; i <= limitLeft; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }

        //diagonal right
        int limitRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= limitRight; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }


        return true;
    }
}
