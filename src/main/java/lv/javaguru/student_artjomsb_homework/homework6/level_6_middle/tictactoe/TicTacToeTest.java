
package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;


class TicTacToeTest {

    public static void main(String[] args) {
        testIsWinPositionForHorizontals();
        testIsNoWinPositionForHorizontals();
        testIsWinPositionForVertical();
        testIsNoWinPositionForVertical();
    }

    private static void testIsWinPositionForHorizontals() {
        String[][] field = {{"X", "-", "0" },
                {"X", "X", "X" },
                {"-", "-", "-" }};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, "X");
        check(result, "Is Win Position For Horizontals");
    }

    private static void testIsNoWinPositionForHorizontals() {
        String[][] field = {{"X", "-", "0" },
                {"X", "-", "X" },
                {"-", "-", "-" }};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, "X");
        check(!result, "Is No Win Position For Horizontals");
    }

    private static void testIsWinPositionForVertical() {
        String[][] field = {{"X", "-", "X" },
                {"X", "X", "X" },
                {"-", "-", "X" }};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(field, "X");
        check(result, "Is Win Position For Vertical");
    }

    private static void testIsNoWinPositionForVertical() {
        String[][] field = {{"X", "-", "0" },
                {"X", "-", "X" },
                {"-", "-", "-" }};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(field, "X");
        check(!result, "Is No Win Position For Vertical");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}