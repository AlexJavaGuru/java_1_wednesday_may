package lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_5;

public class TicTacToeTest {
    public static void main(String[] args) {
        testIsWinPositionForHorizontals();
        testIsWinPositionForVerticals();
        testIsWinPositionForDiagonals();
        testIsWinPosition();
        testIsDrawPosition();

    }


    public static void testIsWinPositionForHorizontals() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, -1, 0},
                {1, 1, 1},
                {-1, -1, -1}};
        boolean result = victim.isWinPositionForHorizontals(field, 1);
        check(result, "Is Win Position For Horizontals");
    }

    public static void testIsWinPositionForVerticals() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, -1, 0},
                {1, 1, 1},
                {-1, -1, -1}};
        boolean result = victim.isWinPositionForVerticals(field, 1);
        check(result, "is Win Position For Verticals");
    }

    public static void testIsWinPositionForDiagonals() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, -1, 0},
                {1, 1, 1},
                {-1, -1, -1}};
        boolean result = victim.isWinPositionForDiagonals(field, 1);
        check(result, "Is Win Position For Diagonals");
    }

    public static void testIsWinPosition() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, -1, 0},
                {1, 1, 1},
                {-1, -1, -1}};
        boolean result = victim.isWinPosition(field, 1);
        check(result, "Is Win Position");
    }

    public static void testIsDrawPosition() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 1, 0},
                {0, 0, 1},
                {1, 0, 1}};
        boolean result = victim.isDrawPosition(field);
        check(result, "Is Draw");
    }


    public static void check(boolean actualResult, String name) {
        if (actualResult) {
            System.out.println("Test " + name + " has successed!");
        } else {
            System.out.println("Test " + name + " has failed!");
        }
    }
}
