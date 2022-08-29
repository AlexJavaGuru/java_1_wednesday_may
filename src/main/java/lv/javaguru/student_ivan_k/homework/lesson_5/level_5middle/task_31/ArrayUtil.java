package lv.javaguru.student_ivan_k.homework.lesson_5.level_5middle.task_31;

import java.util.Random;

public  class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);

        }
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public void printEvenNumbers (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + array[i]);

        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
