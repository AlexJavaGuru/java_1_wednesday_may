package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_5middle.task_22;

class TicTacToeTest {


    public static void main(String[] args) {
        TicTacToeTest runner = new TicTacToeTest();
        runner.shouldWinPositoinHorisontal();
        runner.shouldWinPositoinVertical();
        runner.shouldWinDiagonals();
        runner.shouldWin();
        runner.souldNoWin();
        runner.isDrow();
        runner.isInField();


    }

    public void shouldWinPositoinHorisontal (){
        int[][] testField = {{ 1, 0, -1},
                             { 0, 0, 0},
                             { 1, 1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(testField,0);
        check(result,"shouldWinPositionHorisontal");

    }

    public void shouldWinPositoinVertical (){
        int[][] testField =  {{ -1, -1, 0},
                              { 1, 0, 0},
                              { -1, 0, 0}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(testField,0);
        check(result,"shouldWinPositionVertical");

    }

    public  void shouldWinDiagonals(){
        int[][] testField =  {{ 0, -1, 0},
                               { 1, 0, 0},
                              { 1, 0, 0}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForDiagonals(testField,0);
        check(result,"Diagonals");
    }

    public void shouldWin(){
        int[][] testField =  {{ 0, -1, 0},
                               { 1, -1, -1},
                               { 0, 0, 0}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWin(testField,0);
        check(result,"Win");
    }

    public void souldNoWin(){
        int[][] testField =  {{ 0, -1, 0},
                             { 1, -1, -1},
                              { -1, 0, 0}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWin(testField,0);
        check(!result,"No Win");
    }

    public void isDrow(){
        int[][] testField =  {{ 0, 1, 0},
                              { 1, 0, 1},
                              { 0, 1, 0}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isDraw(testField);
        check(result,"No free space");
    }

    public void isInField(){
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isInRange(new Move(0,0));
        check(result,"IS in Field");

    }

    private static void check(boolean actualResult,String testName){
        if (actualResult){
            System.out.println("Test - " + testName + " has passed.OK");
        }else{
            System.out.println("Test - " + testName + " has failed!!!!");
        }
    }



}
