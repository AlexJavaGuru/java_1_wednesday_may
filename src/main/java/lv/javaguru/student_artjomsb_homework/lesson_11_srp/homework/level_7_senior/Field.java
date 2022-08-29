package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

import java.util.Arrays;

class Field {
    private String[][] field;

    public Field() {
        this.field = new String[6][7];
        field = createField();
    }

    void printBoard() {
        for (String[] cell : field) {
            System.out.println(Arrays.toString(cell));
        }
    }

    public String[][] createField() {
        String[][] gameField = new String[6][7];
        for (int i = 0; i < gameField.length; i++) {
            Arrays.fill(gameField[i], "-");
        }
        return gameField;
    }

    public static void main(String[] args) {
        Field desk = new Field();
        desk.printBoard();
    }
}
