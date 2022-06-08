//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//Вещественные числа можно запрашивать с консоли используя обьект Scanner
//следующим образом:
package main.java.lv.javaguru.student_vladislav_kulikov.homework;

import java.util.Scanner;

public class Lesson2_Task2 {

        public static void main(String args[]){
            System.out.print("Enter two numbers: ");
            Scanner scan = new Scanner(System.in);
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
            System.out.println(num1 + num2);
            System.out.println(num1 - num2);
            System.out.println(num1 * num2);
            System.out.println(num1 / num2);
        }
    }
