package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_5_and_6;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    Random random = new Random();

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

}