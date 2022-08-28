package lv.javaguru.student_vladislav_kulikov.Lesson_5.Task_11;

import java.util.Scanner;

class Array {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
