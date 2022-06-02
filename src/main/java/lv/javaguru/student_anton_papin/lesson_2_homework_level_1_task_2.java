package main.java.lv.javaguru.student_anton_papin;

import java.util.Scanner;

public class lesson_2_homework_level_1_task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double numberA = scanner.nextDouble();
        double numberB = scanner.nextDouble();
        System.out.println( numberA + numberB );
        System.out.println( numberA - numberB );
        System.out.println( numberA * numberB );
        System.out.println( numberA / numberB );
    }
}
