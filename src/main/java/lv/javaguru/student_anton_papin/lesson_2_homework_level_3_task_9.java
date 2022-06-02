package main.java.lv.javaguru.student_anton_papin;

import java.util.Scanner;

public class lesson_2_homework_level_3_task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to see the multiplication table. ");
        int numberA = scanner.nextInt();
        System.out.println(numberA + " X " + "1" + "=" + numberA);
        System.out.println(numberA + " X " + "2" + "=" + numberA * 2);
        System.out.println(numberA + " X " + "3" + "=" + numberA * 3);
        System.out.println(numberA + " X " + "4" + "=" + numberA * 4);
        System.out.println(numberA + " X " + "5" + "=" + numberA * 5);
        System.out.println(numberA + " X " + "6" + "=" + numberA * 6);
        System.out.println(numberA + " X " + "7" + "=" + numberA * 7);
        System.out.println(numberA + " X " + "8" + "=" + numberA * 8);
        System.out.println(numberA + " X " + "9" + "=" + numberA * 9);
        System.out.println(numberA + " X " + "10" + "=" + numberA * 10);
    }
}
