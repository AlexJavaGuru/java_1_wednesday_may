package main.java.lv.javaguru.teacher.lesson_7_encapsulation.lessoncode.alisaV2;

import java.util.Random;
import java.util.Scanner;

//task22-26-31
public class TicTacToe {

    public boolean isWinPositionHorizon(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == playerToCheck && field[i][1] == playerToCheck && field[i][2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionVert(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionDiagonal(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck)
                    || (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (isWinPositionDiagonal(field, playerToCheck) ||
                    isWinPositionVert(field, playerToCheck) ||
                    isWinPositionHorizon(field, playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public int[][] createField() {
        int empty = -1;
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = empty;
            }
        }
        return array;
    }

    public Move getNextMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press which row and column do you choose: ");
        int rowOne = scanner.nextInt();
        int columnTwo = scanner.nextInt();

        Move move = new Move(rowOne, columnTwo);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        System.out.println("game:");
        for (int i = 0; i < field.length; i++) {
            System.out.println();
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + "|");
            }
        }
        System.out.println();
    }


    public void play() {
        int[][] field = createField();

        while (true) {

            printFieldToConsole(field);
            Move moveOne = getNextMove();
            makeMove(field, moveOne, 0);

            printFieldToConsole(field);

            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);

            Move moveTwo = makeAlisaMove(field);
            makeMove(field, moveTwo, 1);
            printFieldToConsole(field);

            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    void makeMove(int[][] field, Move move, int player) {
        field[move.getX()][move.getY()] = player;
    }


    //Alisa
    // -1 |  0 | -1
    //  1 |  1 | -1
    // -1 | -1 | -1
    public Move makeAlisaMove(int[][] field) {
        int[][] copiedField = copyField(field);
        while (hasPossibleMoves(copiedField)) {
            Move enemyMove = generateEnemyMove(copiedField);
            makeMove(copiedField, enemyMove, 0);
            if (isWinPosition(copiedField, 0)) {
                return enemyMove;
            } else {
                makeMove(copiedField, enemyMove, 5);
            }
        }
        return getNextRandomMove(copiedField);
    }

    private Move getNextRandomMove(int[][] field) {
        int x;
        int y;
        do {
            x = getRandom();
            y = getRandom();
        } while (field[x][y] == -1);
        return new Move(x, y);
    }

    private int getRandom() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private Move generateEnemyMove(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    return new Move(i, j);
                }
            }
        }
        return null;
    }

    private boolean hasPossibleMoves(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[][] copyField(int[][] field) {
        int[][] copiedField = new int[field.length][field.length];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                copiedField[i][j] = field[i][j];
            }
        }
        return copiedField;
    }


}

