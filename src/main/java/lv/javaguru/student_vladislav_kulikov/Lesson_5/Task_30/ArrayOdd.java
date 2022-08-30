package lv.javaguru.student_vladislav_kulikov.Lesson_5.Task_30;

import java.util.Arrays;
import java.util.Random;

class ArrayOdd {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[random.nextInt(10)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
