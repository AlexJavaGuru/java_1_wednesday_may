package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = twoDimensionalArray.createTwoDimensionalArray(3,3);
        twoDimensionalArray.fillTwoDimensionalArray(array);
        int sum = twoDimensionalArray.sumOfTwoDimensionalArray(array);
        twoDimensionalArray.printArrayTwoDimensionalArray(array);
        System.out.println("Sum of all numbers in the array: " + sum);
    }

    int[][] createTwoDimensionalArray(int arrayOne, int arrayTwo) {
        return new int[arrayOne][arrayTwo];
    }

    public void fillTwoDimensionalArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
    }

    int sumOfTwoDimensionalArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }

    void printArrayTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
