package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_5_6;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] result = new int[arrayLength];
        return result;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
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

    public int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

    public int oddNumbers(int[] array) {
        for (int j : array) {
            if ((j % 2) == 0) {
                continue;
            }
            System.out.println(j + " ");
        }
        return 0;
    }
}
