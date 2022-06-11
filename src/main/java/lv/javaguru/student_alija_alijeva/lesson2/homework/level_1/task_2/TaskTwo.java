package main.java.lv.javaguru.student_alija_alijeva.lesson2.homework.level_1.task_2;

import java.util.Scanner;

public class TaskTwo {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number one:");
    double number1 = scanner.nextDouble();
    System.out.print("Number two:");
    double number2 = scanner.nextDouble();
    double result = number1 + number2;
    double result2 = number1 - number2;
    double result3 = number1 * number2;
    double result4 = number1 / number2;
    System.out.println("Result  " + result);
    System.out.println("Result  " + result2);
    System.out.println("Result  " + result3);
    System.out.println("Result  " + result4);
}
}
