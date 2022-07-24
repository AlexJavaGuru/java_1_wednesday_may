package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_4junior.task_21;

import java.util.Random;

class TwoDimensionalArray {

    public static int[][] createdArray(int arrayLength, int arrayLength2) {
        return new int[arrayLength][arrayLength2];
    }

    public static void fillArrayRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(11);
            }
        }
    }


    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public static int sumOfNumbersArray (int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static int sumNumbersOfFirstLine (int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[0][i];
        }
        return sum;
    }
    public static int sumNumOfFirstColumn (int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][0];
        }
        return sum;
    }
}
