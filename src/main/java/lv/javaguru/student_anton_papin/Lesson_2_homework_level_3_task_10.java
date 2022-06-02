package main.java.lv.javaguru.student_anton_papin;

import java.util.Scanner;

public class Lesson_2_homework_level_3_task_10 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Please, enter the circle radius.");
    double radius = scanner.nextDouble();
    System.out.println("Perimeter" + "="+ 2 * radius * 3.141592653589793);
    System.out.println("Area" + "=" + radius * radius *3.141592653589793);
}
}
