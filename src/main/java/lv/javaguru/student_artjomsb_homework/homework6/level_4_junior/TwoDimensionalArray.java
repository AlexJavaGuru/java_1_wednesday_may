package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_4_junior;

import java.util.Random;

class TwoDimensionalArray {


    int[][] createArray(int sizeX, int sizeY) {
        return new int[sizeX][sizeY];
    }

    void randomNumberInArray(int[][] arr) {
        Random randomizer = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomizer.nextInt(100);
            }
        }
    }

    int sumInArray(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
}
