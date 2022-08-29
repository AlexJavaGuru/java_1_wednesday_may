package lv.javaguru.student_eugene_sheinin.homework.lesson_2.level_1.task_2;

import java.util.Scanner;

//Написать консольную программу, которая запрашивает у пользователя два целых числа и
//выводит на консоль результаты: сложения, вычитания, умножения и деления.

public class DoubleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number (double):");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number (double):");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double sub = firstNumber - secondNumber;
        double mul = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;

        System.out.println( "sum: " + sum  + ", subtraction: " + sub + ", multiply: " + mul + ", division " + div);
    }
}
