package lv.javaguru.teacher.lesson_5_arrays_for_loop.lessoncode.homeworkexample;

import java.util.Random;

class ArrayUtils {

    public static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static int findMaxNumber(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

}
