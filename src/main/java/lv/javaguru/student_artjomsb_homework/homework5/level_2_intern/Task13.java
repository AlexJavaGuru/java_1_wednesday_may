package lv.javaguru.student_artjomsb_homework.homework5.level_2_intern;

import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);
    }
}
