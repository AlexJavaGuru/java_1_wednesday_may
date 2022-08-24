package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_5middle.task_22;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

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
            for (int j = 0; j < field.length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field.length - 1) {
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

    public boolean isWin(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDraw(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int[][] field = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};

        return field;
    }

    public Move getNextMove(int[][] field) {
        Move move;
        do {
            printFieldToConsole(field);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two correct coordinates ");
            System.out.println("Coordinates X");
            int coordX = scanner.nextInt();
            System.out.println("Coordinates Y");
            int coordY = scanner.nextInt();
            move = new Move(coordX, coordY);
        } while (isMoveValid(field, move));
        return move;

    }

    public boolean isMoveValid(int[][] field, Move move) {
        return (isFreePositiion(field, move) || isInRange(move));
    }

    public boolean isFreePositiion(int[][] field, Move move) {
        return (field[move.getX()][move.getY()] != -1);
    }

    public boolean isInRange(Move move) {
        return (move.getX() >= 2 && move.getX() <= 0) && (move.getY() >= 2 && move.getY() <= 0);

    }


    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print("  |  ");
            }
            System.out.println();
        }


    }

    public void play() {
        int[][] field = createField();
        while (true) {
            System.out.println("Player 0 ");
            Move move0 = getNextMove(field);
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }


            System.out.println("Player 1 ");
            Move move1 = getNextMove(field);
            field[move1.getX()][move1.getY()] = 1;
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

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

}

