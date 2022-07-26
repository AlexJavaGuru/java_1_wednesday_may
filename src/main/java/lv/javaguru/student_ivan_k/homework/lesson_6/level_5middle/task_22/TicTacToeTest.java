package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_5middle.task_22;

public class TicTacToeTest {


    public static void main(String[] args) {
        TicTacToeTest runner = new TicTacToeTest();
        runner.shouldWinPositoinHorisontal();
        runner.shouldWinPositoinVertical();

    }

    public void shouldWinPositoinHorisontal (){
        int[][] testArray = {{ 1, 0, -1},
                             { 0, 0, 0},
                             { 1, 1, 1}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForHorizontals(testArray,0);
        check(result,"shouldWinPositionHorisontal");

    }

    public void shouldWinPositoinVertical (){
        int[][] testArray =  {{ 0, 1, 0},
                              { 1, 0, 0},
                              { 0, 1, 0}};
        TicTacToe subject = new TicTacToe();
        boolean result = subject.isWinPositionForVerticals(testArray,0);
        check(result,"shouldWinPositionVertical");

    }

    private static void check(boolean actualResult,String testName){
        if (actualResult){
            System.out.println("Test - " + testName + " has passed.OK");
        }else{
            System.out.println("Test - " + testName + " has failed!!!!");
        }
    }



}
