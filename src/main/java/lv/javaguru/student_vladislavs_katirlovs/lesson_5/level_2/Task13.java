package lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task13 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        array[0] = random.nextInt(10);
        array[1] = random.nextInt(10);
        array[2] = random.nextInt(10);
        System.out.println(Arrays.toString(array));
        System.out.println(array[0] + array[1] + array[2]);
    }

}
