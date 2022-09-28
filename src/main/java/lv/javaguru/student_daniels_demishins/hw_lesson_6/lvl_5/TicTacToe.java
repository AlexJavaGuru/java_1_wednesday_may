package lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_5;

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

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return diagonalFromBottomToTop(field, playerToCheck) || diagonalFromTopToBottom(field, playerToCheck);
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

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
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

    public int[][] createField() {
        for (int i = 0; i < createField().length; i++) {
            for (int j = 0; j < createField().length; j++) {


            }

        }

        return new int[0][];
    }

    /*   1 1 0
         0 0 1
         1 0 1
     */
}
/*
     playerToCheck = 1

     1 / -1 / 0
     1 /  1 / 1
    -1 / -1 / -1
 */
