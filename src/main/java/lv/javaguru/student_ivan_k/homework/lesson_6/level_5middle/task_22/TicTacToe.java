package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_5middle.task_22;

public class TicTacToe {

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

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (playerToCheck != field[i][j]) {
                    break;
                } else if (j == field.length -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
