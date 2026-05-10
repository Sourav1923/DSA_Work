package com.N_Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] sudoku = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        if(solved(sudoku)){
            display(sudoku);
        }else {
            System.out.println("Invalid Suduku");
        }
    }

    static boolean solved(int [][] board){
        int n = board.length;
        int row =-1;
        int col =-1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if (board[i][j]==0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (emptyLeft == false){
                break;
            }
        }
        //Suduku Solved
        if (emptyLeft == true){
            return true;
        }

        for (int number = 1; number <= board.length ; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col]=number;
                if (solved(board)){

                    return true;
                    //Suduku is solved
                }else {
                    //backtrack
                    board[row][col]=0;
                }
            }
        }
      return false;
    }
    static void display(int board[][]){
        for (int row[] : board){
            for (int element : row){
                System.out.print(element+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    static boolean isSafe(int [][] board, int row, int col, int num){
        //Cheching Row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i]==num){
                return false;
            }
        }

        //Checkig Column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]==num){
                return false;
            }
        }

        //Checking own square

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for (int i = rowStart; i < rowStart+sqrt ; i++) {
            for (int j = colStart; j < colStart+sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
