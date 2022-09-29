package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_6.level_4;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        TwoDimensionalArray twoDimArr = new TwoDimensionalArray();
        twoDimArr.fillArrayWithRandomNumbers(array);
        twoDimArr.printArrayToConsole(array);
        twoDimArr.sumArray(array);
    }
}
