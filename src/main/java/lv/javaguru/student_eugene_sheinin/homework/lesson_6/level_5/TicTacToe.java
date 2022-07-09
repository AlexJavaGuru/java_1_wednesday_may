package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_5;

class TicTacToe {

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{ 1, -1,  0},
                { 1, -1,  1},
                {-1, -1, -1}};


        ticTacToe.fieldView(field);

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

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] != 0 && field[i][j] != 1) {
                    //System.out.print("---field[" + i  + "][" + j + "] = " + field[i][j] + "---");
                    return false;
                }
            }
        }

        return !this.isWinPosition(field, 0) && !this.isWinPosition(field, 1);
    }

    public void fieldView(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print("| " +  field[j][i]);
            }

            System.out.println();
        }
    }
}
