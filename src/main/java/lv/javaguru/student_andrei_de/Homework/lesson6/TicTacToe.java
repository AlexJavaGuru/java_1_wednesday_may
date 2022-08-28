package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (playerToCheck != field[i][j]) {
                    break;
                } else if (j == field[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return diagonalFromBottomToTop(field, playerToCheck) || diagonalTopToBottomT(field, playerToCheck);

    }

    public boolean diagonalFromBottomToTop(int [][] field, int playerTocheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == playerTocheck) {
                return false;
            }
        }
        return true;
    }

    public boolean diagonalTopToBottomT(int [][] field, int playerTocheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length -1 - i] !=playerTocheck) {
                return false;
            }
        }
        return true;
    }

}

