package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_2;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type number a...");
        int firstNumber = scanner.nextInt();
        System.out.println("type number b ...");
        int secondNumber = scanner.nextInt();

       System.out.println(firstNumber + secondNumber);
       System.out.println(firstNumber - secondNumber);
       System.out.println(firstNumber * secondNumber);
       System.out.println(firstNumber / (double) secondNumber);



    }
}
