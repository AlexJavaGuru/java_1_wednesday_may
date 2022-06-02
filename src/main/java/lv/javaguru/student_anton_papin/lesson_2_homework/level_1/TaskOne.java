package main.java.lv.javaguru.student_anton_papin.lesson_2_homework.level_1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        System.out.println( numberA + numberB );
        System.out.println( numberA - numberB );
        System.out.println( numberA * numberB );
        System.out.println( numberA / numberB );

    }
}
