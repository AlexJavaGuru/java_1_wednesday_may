package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_6middle.task_34;

import java.util.Random;

class ArrayUtil {


    public void printArrayToConsole(int[] array) {
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

}
