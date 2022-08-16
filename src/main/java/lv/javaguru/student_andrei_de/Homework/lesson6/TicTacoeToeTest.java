package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

public class TicTacoeToeTest {

    public static void main(String[] args) {
        testIsWinPositionForHorizontals();
        testIsNoWinPositionForHorizontals();

    }

    private static void testIsWinPositionForHorizontals() {
        int[][] field = {{ 1, -1, 0},
                         { 1, 1, 1},
                         { -1, -1, -1}};
    TicTacToe subject = new TicTacToe();
    boolean result = subject.isWinPositionForHorizontals(field, 1);
        check(result, "is Win Position For Horizontals");
    }


    private static void testIsNoWinPositionForHorizontals() {
        int[][] field = {{ 1, -1, 0},
                         { 1, -1, 1},
                         { -1, -1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, 1);
        check(!result, "is  No Win Position For Horizontals");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
