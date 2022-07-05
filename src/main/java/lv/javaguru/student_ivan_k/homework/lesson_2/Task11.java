package main.java.lv.javaguru.student_ivan_k.homework.lesson_2;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
//        три целых числа и выводит их среднее арифметическое
//        (складывает все числа и делит на их количество).
//
//        Примечение: обратите внимание, что результат может быть дробным числом.
public class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scaner = new Scanner(System.in);
        double firstNum = scaner.nextDouble();
        double secNum = scaner.nextDouble();
        double thirNum = scaner.nextDouble();
        double average = (firstNum + secNum + thirNum) /3;
        System.out.println("Avarege is : " + average);
    }
}
