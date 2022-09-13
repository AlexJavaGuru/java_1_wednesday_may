package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_2;

import java.util.Scanner;

public class EqualOrDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number, please:");
        int first = scanner.nextInt();
        System.out.println("Enter second number, please:");
        int second = scanner.nextInt();
        if (first == second) System.out.println("Numbers are equal.");
        else System.out.println("Number are different");
    }
}
