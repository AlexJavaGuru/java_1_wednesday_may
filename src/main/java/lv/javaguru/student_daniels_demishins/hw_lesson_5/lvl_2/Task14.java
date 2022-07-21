package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_5.lvl_2;

import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        double avg = 0;
        for (double m : array) {
            avg += m;
        }
        System.out.println(avg / array.length);

    }
}
