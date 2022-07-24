package main.java.lv.javaguru.student_rodions_pismennijs.lesson_6.level_5_6_7;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.testIsWinPositionForHorizontal();
        test.testIsWinPositionForVertical();
        test.testIsWinPositionForDiagonal();
        test.testIsWinPosition();
        test.testIsDrawPosition();
        test.testCreateField();

    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    TicTacToe ticTacToe = new TicTacToe();

    public void testIsWinPositionForHorizontal() {
        String[][] field = {{ "-",  "-",  "-"},
                            { "X",  "X",  "X"},
                            { "-",  "-",  "-"}};
        boolean result = ticTacToe.isWinPositionHorizontal(field, "X");
        check(result, "Is Win Position For Horizontal");
    }

    public void testIsWinPositionForVertical() {
        String[][] field = {{ "-",  "O",  "-"},
                            { "-",  "O",  "-"},
                            { "-",  "O",  "-"}};
        boolean result = ticTacToe.isWinPositionVertical(field, "O");
        check(result, "Is Win Position For Vertical");
    }

    public void testIsWinPositionForDiagonal() {
        String[][] field = {{ "-",  "-",  "X"},
                            { "-",  "X",  "-"},
                            { "X",  "-",  "-"}};
        boolean result = ticTacToe.isWinPositionDiagonal(field, "X");
        check(result, "Is Win Position For Diagonal");
    }

    public void testIsWinPosition() {
        String[][] field = {{ "O",  "-",  "-"},
                            { "-",  "O",  "-"},
                            { "-",  "-",  "O"}};
        boolean result = ticTacToe.isWinPosition(field, "O");
        check(result, "Is Win Position");
    }

    public void testIsDrawPosition() {
        String[][] field = {{ "O",  "X",  "O"},
                            { "O",  "X",  "X"},
                            { "X",  "O",  "X"}};
        boolean result = ticTacToe.isDrawPosition(field);
        check(result, "Is Draw Position");
    }

    public void testCreateField() {
        String[][] field = {{ "-",  "-",  "-"},
                            { "-",  "-",  "-"},
                            { "-",  "-",  "-"}};
        check(Arrays.deepEquals(field, ticTacToe.createField()),"Create field");
    }
}
