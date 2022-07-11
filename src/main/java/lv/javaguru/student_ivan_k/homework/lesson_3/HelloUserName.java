package main.java.lv.javaguru.student_ivan_k.homework.lesson_3;

import java.util.Scanner;

public class HelloUserName {

    public static void main(String[] args) {

        System.out.println("Enter your name please!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+ name + "!");

    }
}
