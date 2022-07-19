package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_7;

import java.util.Random;

class ArrayUntilRefactoring {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
