package main.java.lv.javaguru.student_anton_papin;

import java.util.Scanner;

public class lesson_2_homework_level_3_task_11 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter three whole numbers to get their arithmetic mean.");
    int numberA = scanner.nextInt();
    int numberB = scanner.nextInt();
    int numberC = scanner.nextInt();
    System.out.println((numberA + numberB +numberC) / 3.0);
}
}
