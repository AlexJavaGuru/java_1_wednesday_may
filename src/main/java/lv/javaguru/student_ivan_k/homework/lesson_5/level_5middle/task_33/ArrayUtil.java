package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_5middle.task_33;

import java.util.Random;

class ArrayUtil {


    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }


    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);

        }
    }

}
