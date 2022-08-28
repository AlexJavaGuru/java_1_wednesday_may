package lv.javaguru.student_vladislav_kulikov.Lesson_5.Task_31_32_33_34_35_36_37_38;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    int[] createArray(int length) {
        return new int[length];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    int findMaxNumber(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    int findMinNumber(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
