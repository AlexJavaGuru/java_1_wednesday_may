package lv.javaguru.student_vadims_vilhovojs.lesson_6;

import java.util.Random;

class TwoDimensionalArrayUtils {
    void fillArrayWithRandomNumbers(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
    }

    int sumOffTwoDimensionArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;


    }
}
