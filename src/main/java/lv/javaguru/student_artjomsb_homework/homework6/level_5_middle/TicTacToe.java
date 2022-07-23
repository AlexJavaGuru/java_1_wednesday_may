package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_5_middle;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {
    public void play() {
        int[][] field = createField();
        printFieldToConsole(field);
        while (true) {
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
           // printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public boolean isWin(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck);
    }

    public boolean isDraw(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public Move getNextMove() {
        Scanner inputMove = new Scanner(System.in);
        System.out.print("Please input coordinate X: ");
        int x = inputMove.nextInt();
        System.out.print("Please input coordinate Y: ");
        int y = inputMove.nextInt();
        return new Move(x, y);
    }

    public int[][] createField() {
        int[][] ticTacToeField = new int[3][3];
        for (int i = 0; i < ticTacToeField.length; i++) {
            Arrays.fill(ticTacToeField[i], -1);
        }
        return ticTacToeField;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (playerToCheck != field[i][j]) {
                    break;
                } else if (j == field[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean diagonalFromTopToBottom(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean diagonalFromBottomToTop(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - 1 - i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return diagonalFromBottomToTop(field, playerToCheck) || diagonalFromTopToBottom(field, playerToCheck);
    }
}
