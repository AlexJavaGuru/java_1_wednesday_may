package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_6.level_5_and_6;

import java.util.Objects;
import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (Objects.equals(field[i][0], playerToCheck) && Objects.equals(field[i][1], playerToCheck) && Objects.equals(field[i][2], playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (Objects.equals(field[0][i], playerToCheck) && Objects.equals(field[1][i], playerToCheck) && Objects.equals(field[2][i], playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((Objects.equals(field[0][0], playerToCheck) && Objects.equals(field[1][1], playerToCheck) && Objects.equals(field[2][2], playerToCheck)) || (Objects.equals(field[2][0], playerToCheck) && Objects.equals(field[1][1], playerToCheck) && Objects.equals(field[0][2], playerToCheck))) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPosition(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDrawPosition(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (Objects.equals(field[i][j], "-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public String[][] createField() {
        String empty = "-";
        String[][] array = new String[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = empty;
            }
        }
        return array;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row : ");
        int row = scanner.nextInt();
        System.out.print("Column : ");
        int column = scanner.nextInt();
        return new Move(row, column);
    }

    public boolean checkIfMoveIsPossible(String[][] field, Move move) {
        return Objects.equals(field[move.getX()][move.getY()], "-");
    }

    public void makeMoveX(String[][] field, Move move, String player) {
        if (checkIfMoveIsPossible(field, move)) {
            field[move.getX()][move.getY()] = player;
        } else {
            System.out.println("Wrong");
            Move moveX = getNextMove();
            makeMoveX(field, moveX, "X");
        }
    }

    public void makeMoveO(String[][] field, Move move, String player) {
        if (checkIfMoveIsPossible(field, move)) {
            field[move.getX()][move.getY()] = player;
        } else {
            System.out.println("Wrong");
            Move moveO = getNextMove();
            makeMoveO(field, moveO, "O");
        }
    }

    public void printFieldToConsole(String[][] field) {
        System.out.println();
        System.out.print("Tic Tac Toe");
        for (int i = 0; i < field.length; i++) {
            System.out.println();
            for (int j = 0; j < field.length; j++) {
                System.out.print(" " + field[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void play() {
        String[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            System.out.println("Player X");
            Move moveX = getNextMove();
            makeMoveX(field, moveX, "X");
            if (isWinPosition(field, "X")) {
                System.out.println("Player X WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            System.out.println("Player O");
            Move moveO = getNextMove();
            makeMoveO(field, moveO, "O");
            if (isWinPosition(field, "O")) {
                System.out.println("Player O WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
        printFieldToConsole(field);
    }
}








