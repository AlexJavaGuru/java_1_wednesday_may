package lv.javaguru.student_vladislav_kulikov.Lesson_5.Task_12;

import java.util.Random;

class Array {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
