package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_2.level_1.task_1;

import java.util.Scanner;

//Написать консольную программу, которая запрашивает у пользователя два целых числа и
//выводит на консоль результаты: сложения, вычитания, умножения и деления.

public class IntegerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number (integer):");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number (integer):");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        float div = (float) firstNumber / secondNumber;

        System.out.println( "sum: " + sum  + ", subtraction: " + sub + ", multiply: " + mul + ", division " + div);
    }
}
