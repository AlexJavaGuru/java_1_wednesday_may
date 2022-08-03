package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_6.Task_22_to_30;

class TicTacToeTest {

    public static void main(String[] args) {

        isWinPositionHorizontalsTest();
        isNoWinPositionHorizontalsTest();
        isWinPositionVerticalsTest();
        isNoWinPositionVerticalsTest();
        diagonalFromTopToBottomTest();
        noDiagonalFromTopToBottomTest();
        diagonalFromBottomToTopTest();
        noDiagonalFromBottomToTopTest();
        isWinHorizontalsPositionTest();
        isNoHorizontalsWinPositionTest();
        isWinVerticalsPositionTest();
        isNoWinVerticalsPositionTest();
        isDiagonalWinPositionTest();
        isReversedDiagonalWinPositionTest();
        isDiagonalNoWinPositionTest();
        isReversedDiagonalNoWinPositionTest();
        isDrawPositionTest();
        isNoDrawPositionTest();
        createFieldTest();
        noCreateFieldTest();
    }

    static void isWinPositionHorizontalsTest() {
        int[][] field = {{1, -1, 0},
                {1, 1, 1},
                {-1, -1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, 1);
        check(result, "Is Win Position For Horizontals");
    }

    static void isNoWinPositionHorizontalsTest() {
        int[][] field = {{1, -1, 0},
                {1, 1, 0},
                {1, 0, 0}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, 1);
        check(!result, "Is No Win Position For Horizontals");
    }

    static void isWinPositionVerticalsTest() {
        int[][] field = {{0, 1, 0},
                {1, 1, -1},
                {1, 1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(field, 1);
        check(result, "Is Win Position For Verticals");
    }

    static void isNoWinPositionVerticalsTest() {
        int[][] field = {{0, 0, 0},
                {1, 1, -1},
                {1, 1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(field, 1);
        check(!result, "Is No Win Position For Verticals");
    }

    static void diagonalFromTopToBottomTest() {
        int[][] field = {{1, -1, 0},
                {0, 1, 1},
                {0, 1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForDiagonals(field, 1);
        check(result, "Diagonal From Top To Bottom Test");
    }

    static void noDiagonalFromTopToBottomTest() {

        int[][] field = {{1, -1, 0},
                {0, 0, 1},
                {0, 1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForDiagonals(field, 1);
        check(!result, "No Diagonal From Top To Bottom Test");
    }

    static void diagonalFromBottomToTopTest() {
        int[][] field = {{-1, 0, 0},
                {1, 0, -1},
                {0, 0, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.diagonalFromBottomToTop(field, 0);
        check(result, "Diagonal From Bottom To Top");
    }

    static void noDiagonalFromBottomToTopTest() {
        int[][] field = {{-1, 0, 0},
                {1, 0, -1},
                {1, 0, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.diagonalFromBottomToTop(field, 0);
        check(!result, "No Diagonal From Bottom To Top ");
    }

    static void isWinHorizontalsPositionTest() {
        int[][] field = {{-1, 0, 0},
                {0, 0, 0},
                {-1, 0, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 0);
        check(result, " Is Win Position ''Horizontals''");
    }

    static void isNoHorizontalsWinPositionTest() {
        int[][] field = {{-1, 0, 0},
                {1, 1, -1},
                {-1, 0, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 0);
        check(!result," Is No Win Position ''Horizontals''");
    }

    static void isWinVerticalsPositionTest() {
        int[][] field = {{-1, 0, 0},
                         {1, 0, -1},
                         {-1, 0, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 0);
        check(result," Is Win Position ''Verticals''");
    }

    static void isNoWinVerticalsPositionTest() {
        int[][] field = {{-1, 0, 0},
                         {1, -1, -1},
                         {-1, 0, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 0);
        check(!result," Is No Win Position ''Verticals''");
    }

    static void isDiagonalWinPositionTest() {
        int[][] field = {{1, 0, 1},
                         {1, 1, -1},
                         {1, 0, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 1);
        check(result," Is Win Position ''Diagonal''");
    }

    static void isReversedDiagonalWinPositionTest() {
        int[][] field = {{1, 0, 1},
                         {1, 1, -1},
                         {0, 0, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 1);
        check(result," Is Win Position ''Reversed Diagonal''");
    }
    static void isDiagonalNoWinPositionTest() {
        int[][] field = {{1, 0, 0},
                         {1, 0, -1},
                         {-1, 0, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 1);
        check(!result," Is No Win Position ''Diagonal''");
    }
    static void isReversedDiagonalNoWinPositionTest() {
        int[][] field = {{1, 0, 0},
                         {1, -1, -1},
                         {-1, 0, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 1);
        check(!result," Is No Win Position ''Reversed Diagonal''");
    }

    static void isDrawPositionTest() {
        int[][] field = {{1, 0, 0},
                         {1, 1, 0},
                         {0, 0, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isDrawPosition(field);
        check(result, "Is Draw Position");
    }

    static void isNoDrawPositionTest() {
        int[][] field = {{1, 0, 0},
                         {1, -1, 0},
                         {0, 0, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isDrawPosition(field);
        check(!result, "Is No Draw Position ");
    }

    static void createFieldTest() {
        TicTacToe subject = new TicTacToe();
        int[][]actualResult = subject.createField();
        boolean result = checkCreateField(actualResult);
        check(result, "Create Field Test");
    }
    static void noCreateFieldTest() {
        TicTacToe subject = new TicTacToe();
        int[][] actualResult = subject.createField();
        actualResult = new int[][]{{1, 1, 1},
                                   {1, 0, 1},
                                   {0, 0, 1}};
        boolean result = checkCreateField(actualResult);
        check(!result, "No Create Field Test");
    }
    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
    static boolean checkCreateField(int[][]field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] == 1 || field[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}