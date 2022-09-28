package lv.javaguru.student_artjomsb_homework.homework6.level_5_middle;


class TicTacToeTest {
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
}
