
package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;


class TicTacToeTest {
    /*
   public static void main(String[] args) {
        testIsWinPositionForHorizontals();
        testIsNoWinPositionForHorizontals();
        testIsWinPositionForVertical();
        testIsNoWinPositionForVertical();
    }

    private static void testIsWinPositionForHorizontals() {
        int[][] field = {{1, -1, 0},
                        {1, 1, 1},
                        {-1, -1, -1}};
       TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, 1);
        check(result, "Is Win Position For Horizontals");
    }

    private static void testIsNoWinPositionForHorizontals() {
        int[][] field = {{1, -1, 0},
                        {1, -1, 1},
                        {-1, -1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, 1);
        check(!result, "Is No Win Position For Horizontals");
    }
    private static void testIsWinPositionForVertical() {
        int[][] field =     {{1, -1, 1},
                             {1, 1, 1},
                             {-1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(field, 1);
        check(result, "Is Win Position For Vertical");
    }

    private static void testIsNoWinPositionForVertical() {
        int[][] field = {{1, -1, 0},
                        {1, -1, 1},
                        {-1, -1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(field, 1);
        check(!result, "Is No Win Position For Vertical");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
    */
    public static void main(String[] args) {
        testCheckIfNextMoveWillMakeTwoPositionForWin();
        checkNumberOfWins();
        testCheckIfNextMoveWillMakeTwoPositionForWinTwo();
    }
    static void checkNumberOfWins(){
        MariannaAI testAI = new MariannaAI(0,0,"0",false);
        TicTacToe tester = new TicTacToe();
        String [][] testField ={{"X", "-", "X"},
                                {"-", "0", "-"},
                                {"0", "-", "X"}};;
        int result=testAI.opponentPossibleWins(testField,"X");
        int expectedResult = 2;
        check(result ==  expectedResult,"Check number of wins");
    }
    static void testCheckIfNextMoveWillMakeTwoPositionForWin(){
        MariannaAI testAI = new MariannaAI(0,0,"0",false);
        TicTacToe tester = new TicTacToe();
        String [][] testField ={{"-", "X", "-"},
                                {"-", "0", "-"},
                                {"0", "-", "X"}};
//        tester.printFieldToConsole(testField);
        check(testAI.isDoubleWinPositionPossible(testField,"X"), "Check is next position have two options to win");

    }
    static void testCheckIfNextMoveWillMakeTwoPositionForWinTwo() {
        MariannaAI testAI = new MariannaAI(0, 0, "0", false);
        TicTacToe tester = new TicTacToe();
        String[][] testField = {{"X", "-", "-" },
                                {"-", "-", "0" },
                                {"0", "X", "-" }};
        tester.printFieldToConsole(testField);
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