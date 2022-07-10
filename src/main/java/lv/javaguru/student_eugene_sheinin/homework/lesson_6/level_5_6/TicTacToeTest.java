package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_5_6;


import java.util.Arrays;

public class TicTacToeTest {

    public static void main(String[] args) {
        testIsWinPositionForHorizontals();
        testIsNoWinPositionForHorizontals();
        testIsWinPositionForVerticals();
        testIsNotWinPositionForVerticals();
        testIsWinDiagonalFromBottomToTop();
        testIsNotWinDiagonalFromTopToBottom();
        testIsWinDiagonalFromBottomToTop();
        testIsNotWinDiagonalFromBottomToTop();
        testIsWinPositionForDiagonals();
        testIsNotWinPositionForDiagonals();
        testIsWinPosition();
        testIsNotWinPosition();
        testDrawPosition();
        testNotDrawPosition();
        testCreateField();
    }


    private static void testIsWinPositionForHorizontals() {
        int[][] field = {{ 1, -1,  0},
                { 1,  1,  1},
                {-1, -1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, 1);
        check(result, "Is Win Position For Horizontals");
    }

    private static void testIsNoWinPositionForHorizontals() {
        int[][] field = {{ 1, -1,  0},
                { 1, -1,  1},
                {-1, -1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(field, 1);
        check(!result, "Is No Win Position For Horizontals");
    }

    private static void testIsWinPositionForVerticals() {
        int[][] field = {{ -1, -1,  1},
                { -1, 1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(field, 1);
        check(result, "Is Win Position For Verticals");
    }

    private static void testIsNotWinPositionForVerticals() {
        int[][] field = {{ -1, -1,  1},
                { 1, 1,  1},
                {1, -1, -1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(field, 1);
        check(!result, "Is Not Win Position For Verticals");
    }

    private static void testIsWinDiagonalFromTopToBottom() {
        int[][] field = {{ 1, -1,  1},
                { -1, 1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.diagonalFromTopToBottom(field, 1);
        check(result, "Is Win Position For Diagonal From Top To Bottom");
    }

    private static void testIsNotWinDiagonalFromTopToBottom() {
        int[][] field = {{ -1, -1,  1},
                { -1, 1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.diagonalFromTopToBottom(field, 1);
        check(!result, "Is Not Win Position For Diagonal From Top To Bottom");
    }

    private static void testIsWinDiagonalFromBottomToTop() {
        int[][] field = {{ -1, -1,  1},
                { -1, 1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.diagonalFromBottomToTop(field, 1);
        check(result, "Is Win Position For Diagonal From Bottom To Top");
    }

    private static void testIsNotWinDiagonalFromBottomToTop() {
        int[][] field = {{ -1, -1,  1},
                { -1, -1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.diagonalFromBottomToTop(field, 1);
        check(!result, "Is Not Win Position For Diagonal From Bottom To Top");
    }

    public static void testIsWinPositionForDiagonals() {
        int[][] field = {{ -1, -1,  1},
                { -1, 1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForDiagonals(field, 1);
        check(result, "Is Win Position For Diagonals");
    }

    public static void testIsNotWinPositionForDiagonals() {
        int[][] field = {{ -1, -1,  1},
                { -1, -1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForDiagonals(field, 1);
        check(!result, "Is Not Win Position For Diagonals");
    }

    public static void testIsWinPosition() {
        int[][] field = {{ -1, -1,  1},
                { -1, 1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 1);
        check(result, "Is Win Position");
    }

    public static void testIsNotWinPosition() {
        int[][] field = {{ -1, 1,  -1},
                { -1, -1,  1},
                {1, -1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPosition(field, 1);
        check(!result, "Is Not Win Position");
    }


    public static void testDrawPosition() {
        int[][] field = {{ 0, 1,  0},
                         { 0, 1,  1},
                         {1, 0, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isDrawPosition(field);
        check(result, "Is Draw Position");
    }

    public static void testNotDrawPosition() {
        int[][] field = {{ 0, 1,  0},
                { -1, 1,  1},
                {1, 0, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isDrawPosition(field);
        check(!result, "Is Not Draw Win Position");
    }

    public static void testCreateField() {
        int[][] field = {{ -1, -1,  -1},
                { -1, -1,  -1},
                {-1, -1, -1}};
        TicTacToe subject = new TicTacToe();
        check(Arrays.deepEquals(field, subject.createField()), "Create Field Test");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
