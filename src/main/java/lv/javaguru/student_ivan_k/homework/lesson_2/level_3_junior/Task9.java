package main.java.lv.javaguru.student_ivan_k.homework.lesson_2.level_3_junior;

//Напишите программу, которая запрашивает у пользователя целое число
//        и печатает на консоль таблицу умножения для этого числа до 10.
//
//        Test Data:
//        Input a number: 8
//
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int mult1 = number * 1;
        int mult2 = number * 2;
        int mult3 = number * 3;
        int mult4 = number * 4;
        int mult5 = number * 5;
        int mult6 = number * 6;
        int mult7 = number * 7;
        int mult8 = number * 8;
        int mult9 = number * 9;
        int mult10 = number * 10;
        System.out.println(number + "  *  " + 1 + "  =  " + mult1);
        System.out.println(number + "  *  " + 2 + "  =  " + mult2);
        System.out.println(number + "  *  " + 3 + "  =  " + mult3);
        System.out.println(number + "  *  " + 4 + "  =  " + mult4);
        System.out.println(number + "  *  " + 5 + "  =  " + mult5);
        System.out.println(number + "  *  " + 6 + "  =  " + mult6);
        System.out.println(number + "  *  " + 7 + "  =  " + mult7);
        System.out.println(number + "  *  " + 8 + "  =  " + mult8);
        System.out.println(number + "  *  " + 9 + "  =  " + mult9);
        System.out.println(number + "  *  " + 10 + "  =  " + mult10);


    }
}
