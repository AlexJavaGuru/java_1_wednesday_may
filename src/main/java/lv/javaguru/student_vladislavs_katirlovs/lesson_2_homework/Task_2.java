package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_2_homework;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type variable a...");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Type variable b...");
        double secondDoubleNumber = scanner.nextDouble();

        double add = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mult = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Sum of numbers - " + add);
        System.out.println("Subtraction of numbers - " + sub);
        System.out.println("Multiplication of numbers - " + mult);
        System.out.println("Division of numbers - " + div);


    }
}
