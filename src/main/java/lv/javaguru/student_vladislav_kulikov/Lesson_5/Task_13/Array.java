package lv.javaguru.student_vladislav_kulikov.Lesson_5.Task_13;

import java.util.Random;

class Array {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
