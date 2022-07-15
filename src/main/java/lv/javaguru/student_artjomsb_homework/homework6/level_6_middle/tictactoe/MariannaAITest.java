package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;

class MariannaAITest {
    public static void main(String[] args) {
        testCheckIfNextMoveWillMakeTwoPositionForWin();
        testCheckIfNextMoveWillMakeTwoPositionForWinTwo();
        checkNumberOfWins();
    }

    static void checkNumberOfWins() {
        MariannaAI testAI = new MariannaAI(0, 0, "0", false);
        String[][] testField = {{"X", "-", "X" },
                                {"-", "0", "-" },
                                {"0", "-", "X" }};
        int result = testAI.howManyWinsIsPossible(testField, "X");
        int expectedResult = 2;
        check(result == expectedResult, "Check number of wins");
    }

    static void testCheckIfNextMoveWillMakeTwoPositionForWin() {
        MariannaAI testAI = new MariannaAI(0, 0, "0", false);
        String[][] testField = {{"-", "X", "-" },
                                {"-", "-", "0" },
                                {"0", "-", "X" }};
        check(testAI.isDoubleWinPositionPossible(testField, "X"), "Check is next position have two options to win");

    }

    static void testCheckIfNextMoveWillMakeTwoPositionForWinTwo() {
        MariannaAI testAI = new MariannaAI(0, 0, "0", false);
        String[][] testField = {{"X", "-", "-" },
                {"-", "-", "0" },
                {"0", "X", "-" }};
        check(testAI.isDoubleWinPositionPossible(testField, testAI.getTicTacToeRole()), "Check is next position have two options to win");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
