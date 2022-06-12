package main.java.lv.javaguru.teacher.lesson_2_variables.homework.level_1_intern;

import java.util.Scanner;

public class Task_1_hw {

    public static void main (String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println();
        int secondNumber = scanner.nextInt();
        System.out.println();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}
