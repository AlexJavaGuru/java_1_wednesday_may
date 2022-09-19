package lv.javaguru.student_ivan_k.homework.lesson_5.level_2intern.task_11;

import java.util.Scanner;

import static java.lang.System.in;

class ArrayThrePers {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill array please: ");
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        System.out.println("Array is DONE! ");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


    }
}
