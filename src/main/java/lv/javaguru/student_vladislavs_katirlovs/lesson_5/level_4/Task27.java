package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task27 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        String maxArray = String.valueOf(Arrays.stream(array).max());
        maxArray = maxArray.replaceAll("[^0-9]", "");
        System.out.println("Max number in array is " + maxArray);
    }
}
