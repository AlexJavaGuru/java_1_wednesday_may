package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson_2;

import java.util.Scanner;

public class level_1_task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("The result of addition = " + (a + b));
        System.out.println("The result of subtraction = " + (a - b));
        System.out.println("The result of multiplication = " + (a * b));
        System.out.println("Division result = " + ((double) a / b));

    }
}