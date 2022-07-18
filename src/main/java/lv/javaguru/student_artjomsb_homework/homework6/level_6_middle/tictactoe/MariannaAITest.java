package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;

import java.util.Arrays;

class MariannaAITest {
    public static void main(String[] args) {
        checkMoveInBestCorner();
        testCheckIfNextMoveWillMakeTwoPositionForWin();
        testCheckIfNextMoveWillMakeTwoPositionForWinTwo();
        testCheckIfNextMoveWillNotFindTwoPositionForWinTwo();
        checkNumberOfWins();
        checkNumberOfWinsTwo();
        testBotMakeMove();
        testCheckMoveInRandomCorner();
        testRandomMove();
        checkThatNextMoveIsGetWin();
        checkThatNextMoveDontGetWin();
        checkNotMoveInBestCorner();
        testEmptyField();
        testNotEmptyField();
    }
    static void testEmptyField(){
        MariannaAI testAI = new MariannaAI(1, 0, "0", false);
        String[][] testField = {{"-", "-", "-" },
                {"-", "-", "-" },
                {"-", "-", "-" }};
        boolean result = testAI.isFieldEmpty(testField);
        check(result, "Test check that field is empty");
    }
    static void testNotEmptyField(){
        MariannaAI testAI = new MariannaAI(1, 0, "0", false);
        String[][] testField = {{"-", "-", "-" },
                {"-", "-", "-" },
                {"-", "-", "0" }};
        boolean result = testAI.isFieldEmpty(testField);
        check(!result, "Test check that field is not empty");
    }
    static void checkMoveInBestCorner(){
        MariannaAI testAI = new MariannaAI(1, 0, "0", false);
        String[][] testField = {{"-", "X", "-" },
                                {"-", "0", "-" },
                                {"-", "0", "X" }};
        boolean expectedResult = testAI.moveToBestCorner(testField,"X");
        testAI.makeMove(testField);
        check(expectedResult && testField[2][0].equals("0") && testField[0][0].equals("-") && testField[0][2].equals("-"),"Test check that next move will be in more winnable corner");
    }
    static void checkNotMoveInBestCorner(){
        MariannaAI testAI = new MariannaAI(1, 1, "0", false);
        String[][] testField = {{"-", "X", "-" },
                                {"-", "-", "-" },
                                {"-", "X", "-" }};
        boolean expectedResult = testAI.moveToBestCorner(testField,"X");
        testAI.makeMove(testField);
        check(!expectedResult && testField[2][0].equals("-") && testField[0][0].equals("-") && testField[0][2].equals("-") && testField[2][2].equals("-") && testField[1][1].equals("0"),"Test check that next move not go in corner");
    }
    static void checkThatNextMoveIsGetWin(){
        MariannaAI testAI = new MariannaAI(0, 0, "0", false);
        String[][] testField = {{"X", "-", "X" },
                                {"0", "0", "X" },
                                {"0", "-", "0" }};
        boolean expectedResult = testAI.isNextMoveWillGetWinOrLose(testField,"0");
        testAI.makeMove(testField);
        check(expectedResult && testField[2][1].equals("0"),"Test check that next move can win and assign value in object");
    }
    static void checkThatNextMoveDontGetWin(){
        MariannaAI testAI = new MariannaAI(1, 0, "0", false);
        String[][] testField = {{"X", "X", "X" },
                                {"-", "0", "-" },
                                {"0", "0", "0" }};
        boolean expectedResult = testAI.isNextMoveWillGetWinOrLose(testField,"0");
        testAI.makeMove(testField);
        check(expectedResult && testField[1][0].equals("0") &&testField[1][2].equals("-"),"Test check that next move can't win and not assign value in object");
    }
static void testRandomMove(){
    MariannaAI testAI = new MariannaAI(0, 0, "0", false);
    String[][] testField = {{"X", "X", "X" },
                            {"X", "0", "X" },
                            {"0", "-", "X" }};
    String[][] expectedField = {{"X", "X", "X" },
                                {"X", "0", "X" },
                                {"0", "0", "X" }};
    testAI.noobMove(testField);
    check(Arrays.deepEquals(testField,expectedField), "Check that random move didn't go to occupied cell");
}
    static void checkNumberOfWins() {
        MariannaAI testAI = new MariannaAI(0, 0, "X", false);
        String[][] testField = {{"X", "-", "X" },
                                {"-", "0", "-" },
                                {"X", "-", "X" }};
        int result = testAI.howManyWinsIsPossible(testField, "X");
        int expectedResult = 4;
        check(result == expectedResult, "Check number of wins");
    }
    static void checkNumberOfWinsTwo() {
        MariannaAI testAI = new MariannaAI(0, 0, "X", false);
        String[][] testField = {{"X", "-", "0" },
                                {"0", "0", "-" },
                                {"-", "0", "X" }};
        int result = testAI.howManyWinsIsPossible(testField, "X");
        int expectedResult = 0;
        check(result == expectedResult, "Check number of wins");
    }

    static void testCheckIfNextMoveWillNotFindTwoPositionForWinTwo() {
        MariannaAI testAI = new MariannaAI(0, 0, "0", false);
        String[][] testField = {{"X", "-", "X" },
                {"-", "-", "-" },
                {"0", "X", "0" }};
        check(!testAI.isDoubleWinPositionPossible(testField, "0"), "Check is next position not have two options to win");
    }

    static void testCheckMoveInRandomCorner() {
        MariannaAI testAI = new MariannaAI(0, 0, "0", false);
        String[][] testField = {{"X", "0", "-" },
                {"-", "X", "-" },
                {"-", "X", "X" }};
        testAI.moveToRandomCorner(testField);
        check(testField[0][0].equals("X") && testField[2][2].equals("X") && (testField[2][0].equals("0") || testField[0][2].equals("0")), "Check random move in corner and didn't go in occupied cell");
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
        check(testAI.isDoubleWinPositionPossible(testField, "0"), "Check is next position have two options to win");
    }

    static void testBotMakeMove() {
        MariannaAI testAI = new MariannaAI(1, 1, "X", false);
        String[][] testField = {{"-", "X", "-" },
                {"-", "-", "0" },
                {"0", "-", "X" }};
        testAI.makeMove(testField);
        check(testField[1][1].equals("X"), "Check that bot make move");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + ", has passed");
        } else {
            System.out.println("Test - " + testName + ", has failed");
        }
    }
}
