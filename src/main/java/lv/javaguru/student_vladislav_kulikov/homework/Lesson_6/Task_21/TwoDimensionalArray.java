package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_6.Task_21;

import java.util.Random;

class TwoDimensionalArray {

    int[][] makeDimensionalArray(int length) {
        int[][] array = new int[length][length];
        return array;
    }

    void fullWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    int sumOfAllNumbers(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result = result + array[i][j];
            }
        }
        return result;
    }

}
