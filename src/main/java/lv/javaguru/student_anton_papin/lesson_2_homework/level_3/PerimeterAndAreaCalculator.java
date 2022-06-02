package main.java.lv.javaguru.student_anton_papin.lesson_2_homework.level_3;

import java.util.Scanner;

public class PerimeterAndAreaCalculator {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Please, enter the circle radius.");
    double radius = scanner.nextDouble();
    System.out.println("Perimeter" + "="+ 2 * radius * 3.141592653589793);
    System.out.println("Area" + "=" + radius * radius *3.141592653589793);
}
}
