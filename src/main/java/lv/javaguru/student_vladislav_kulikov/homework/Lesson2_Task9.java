//Напишите программу, которая запрашивает у пользователя целое число
//и печатает на консоль таблицу умножения для этого числа до 10.
package main.java.lv.javaguru.student_vladislav_kulikov.homework;

import java.util.Scanner;

public class Lesson2_Task9 {

    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = 1;

        while (a < 11){
            int c = num * a;
            System.out.println(c);
            a++;
        }
    }
}
