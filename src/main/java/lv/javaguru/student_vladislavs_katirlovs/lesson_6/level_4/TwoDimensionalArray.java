package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    Random random = new Random();

    public void fillArrayWithRandomNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public void printArrayToConsole(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public void sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);
    }
}
