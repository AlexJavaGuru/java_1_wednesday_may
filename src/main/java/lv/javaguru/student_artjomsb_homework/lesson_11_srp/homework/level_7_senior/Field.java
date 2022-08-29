package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

import java.util.Arrays;

class Field {
    private String[][] field;

    public Field() {
        this.field = new String[6][7];
        field = createField();
    }

    void makeMove(Move move, Player player) {
        int column = move.getColumnNum();
        String role = player.getRole();
        for (int i = field.length - 1; i >= 0; i--) {
            if (field[i][column].equals("-")) {
                field[i][column] = role;
                break;
            }
        }
    }

    boolean isMovePossible(Move move) {
        return field[0][move.getColumnNum()].equals("-");
    }

    boolean isDraw() {
        for (int i = 0; i < field[0].length; i++) {
            if (field[0][i].equals("-")) {
                return false;
            }
        }
        return true;
    }

    void printField() {
        for (String[] cell : field) {
            System.out.println(Arrays.toString(cell));
        }
    }

    private String[][] createField() {
        String[][] gameField = new String[6][7];
        for (String[] strings : gameField) {
            Arrays.fill(strings, "-");
        }
        return gameField;
    }

    public String[][] getField() {
        return field;
    }
}
