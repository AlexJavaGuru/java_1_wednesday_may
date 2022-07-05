package main.java.lv.javaguru.teacher.lesson_5_arrays_for_loop.lessoncode.homeworkexample;

import java.util.Arrays;

public class ArrayUtilsDemo {

    public static void main(String[] args) {

        int[] randomValuesHolder = ArrayUtils.createArray(10);
        System.out.println(Arrays.toString(randomValuesHolder));

        ArrayUtils.fillArrayWithRandomNumbers(randomValuesHolder);

        System.out.println(Arrays.toString(randomValuesHolder));

        int maxNumber = ArrayUtils.findMaxNumber(randomValuesHolder);
        System.out.println("Max - " + maxNumber);
    }
}
