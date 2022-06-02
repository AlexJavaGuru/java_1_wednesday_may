package main.java.lv.javaguru.student_anton_papin.lesson_2_homework.level_3;

import java.util.Scanner;

public class TaskEleven {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter three whole numbers to get their arithmetic mean.");
    int numberA = scanner.nextInt();
    int numberB = scanner.nextInt();
    int numberC = scanner.nextInt();
    System.out.println((numberA + numberB +numberC) / 3.0);
}
}
