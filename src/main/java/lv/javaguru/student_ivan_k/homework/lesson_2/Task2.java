package lv.javaguru.student_ivan_k.homework.lesson_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter two fractional numbers");
        System.out.println("Enter first number :");
        Scanner scr = new Scanner(System.in);
        double firstDoubleNumber = scr.nextDouble();
        System.out.println("Enter second number :");
        double secondDoubleNumber = scr.nextDouble();
        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mult = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;
        System.out.println("Addition is : " + sum);
        System.out.println("Subtraction is : " + sub);
        System.out.println("Multiplication is " + mult);
        System.out.println("Division is : " + div);




    }
}
