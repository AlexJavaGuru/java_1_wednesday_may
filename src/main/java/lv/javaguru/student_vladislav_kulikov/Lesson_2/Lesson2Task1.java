package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_2;

import java.util.Scanner;

public class Lesson2Task1 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}
