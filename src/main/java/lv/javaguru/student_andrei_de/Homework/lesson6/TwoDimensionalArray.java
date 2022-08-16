package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = twoDimensionalArray.createTwoDimensionalArray(5,6);
        twoDimensionalArray.fillTwoDimensionalArray(array);
        twoDimensionalArray.printArray(array);
        int sum = twoDimensionalArray.sumTwoDimensionalArray(array);
        System.out.println(sum);
    }
    int [][] createTwoDimensionalArray(int arrayOne, int arrayTwo) {
        return new int[arrayOne][arrayTwo];
    }

    void fillTwoDimensionalArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    int sumTwoDimensionalArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];

            }
        }
        return sum;
    }

    void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
                System.out.println(" | ");
            }
            System.out.println();
        }
    }
}
