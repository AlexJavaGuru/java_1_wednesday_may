package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_6.level_5_and_6;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.testIsWinPositionForHorizontals();
        ticTacToeTest.testIsWinPositionForVerticals();
        ticTacToeTest.testIsWinPositionForDiagonals();
        ticTacToeTest.testIsWinPosition();
        ticTacToeTest.testIsDrawPosition();
        ticTacToeTest.testCreateField();
    }

    TicTacToe ticTacToe = new TicTacToe();

    public void testIsWinPositionForHorizontals() {
        String[][] field = {{ "X",  "X",  "X"},
                            { "-",  "-",  "-"},
                            { "-",  "-",  "-"}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field, "X");
        check(result, "Is Win Position For Horizontals");
    }

    public void testIsWinPositionForVerticals() {
        String[][] field = {{ "X",  "-",  "-"},
                            { "X",  "-",  "-"},
                            { "X",  "-",  "-"}};
        boolean result = ticTacToe.isWinPositionForVerticals(field, "X");
        check(result, "Is Win Position For Verticals");
    }

    public void testIsWinPositionForDiagonals() {
        String[][] field = {{ "-",  "-",  "X"},
                            { "-",  "X",  "-"},
                            { "X",  "-",  "-"}};
        boolean result = ticTacToe.isWinPositionForDiagonals(field, "X");
        check(result, "Is Win Position For Diagonals");
    }

    public void testIsWinPosition() {
        String[][] field = {{ "X",  "X",  "X"},
                            { "-",  "-",  "-"},
                            { "-",  "-",  "-"}};
        boolean result = ticTacToe.isWinPosition(field, "X");
        check(result, "Is Win Position");
    }

    public void testIsDrawPosition() {
        String[][] field = {{ "O",  "X",  "X"},
                            { "X",  "O",  "O"},
                            { "O",  "X",  "X"}};
        boolean result = ticTacToe.isDrawPosition(field);
        check(result, "Is Draw Position");
    }

    public void testCreateField() {
        String[][] field = {{ "-",  "-",  "-"},
                            { "-",  "-",  "-"},
                            { "-",  "-",  "-"}};
        check(Arrays.deepEquals(field, ticTacToe.createField()),"Create field");
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
