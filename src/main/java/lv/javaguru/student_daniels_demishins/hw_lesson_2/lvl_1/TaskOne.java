package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_2.lvl_1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int firstNumber = number.nextInt();
        int secondNumber = number.nextInt();
        System.out.println(firstNumber + secondNumber);

        int threeNumber = number.nextInt();
        int fourNumber = number.nextInt();
        System.out.println(firstNumber - secondNumber);

        int fiveNumber = number.nextInt();
        int sixNumber = number.nextInt();
        System.out.println(firstNumber * secondNumber);

        int sevenNumber = number.nextInt();
        int eightNumber = number.nextInt();
        System.out.println(firstNumber / secondNumber);

    }
}
