package org.example;

public class Validity {

    static boolean isSudokuSolved(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValidInRow(i, j, board[i][j], board) ||
                        !isValidInColumn(i, j, board[i][j], board) ||
                        !isValidInSubgrid(i, j, board[i][j], board)) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isValidInput(int[] userInput, int[][] board) {
        int row = userInput[0];
        int col = userInput[1];
        int value = userInput[2];
        if (row < 0 || row >= 9 || col < 0 || col >= 9 || value < 1 || value > 9) {
            System.out.println("Invalid input. Please enter integers between 1 and 9.");
            return false;
        }
        return isValidInRow(row, col, value, board) &&
                isValidInColumn(row, col, value, board) &&
                isValidInSubgrid(row, col, value, board);
    }
    static boolean isBoardComplete(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isValidInRow(int row, int col, int value, int[][] board) {
        for (int j = 0; j < 9; j++) {
            if (j != col && board[row][j] == value) {
                return false;
            }
        }
        return true;
    }
    static boolean isValidInColumn(int row, int col, int value, int[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == value) {
                return false;
            }
        }
        return true;
    }
    static boolean isValidInSubgrid(int row, int col, int value, int[][] board) {
        int subgridStartRow = (row / 3) * 3;
        int subgridStartCol = (col / 3) * 3;

        for (int i = subgridStartRow; i < subgridStartRow + 3; i++) {
            for (int j = subgridStartCol; j < subgridStartCol + 3; j++) {
                if ((i != row || j != col) && board[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
