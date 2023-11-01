package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sudoku Game");
        Board x = new Board();
        x.displayBoard();
        Scanner scanner = new Scanner(System.in);

        while (!Validity.isBoardComplete(x.getBoard())) {
            int[] userInput = getUserInput();
            if (Validity.isValidInput(userInput, x.getBoard())) {
                x.fillCell(userInput);
                x.displayBoard();
            } else {
                continue;
            }
        }
        if (Validity.isSudokuSolved(x.getBoard())) {
            System.out.println("Congratulations! You solved the Sudoku puzzle.");
        } else {
            System.out.println("Sorry, your solution is incorrect.");
        }
        scanner.close();
    }
    private static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int[] userInput = new int[3];
        System.out.print("Enter row (1-9), column (1-9), and value (1-9): ");

        try {
            userInput[0] = scanner.nextInt() - 1;
            userInput[1] = scanner.nextInt() - 1;
            userInput[2] = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers between 1 and 9.");
            scanner.nextLine();
            return getUserInput();
        }
        return userInput;
    }
}
