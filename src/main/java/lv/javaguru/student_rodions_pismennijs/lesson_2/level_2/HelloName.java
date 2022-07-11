package main.java.lv.javaguru.student_rodions_pismennijs.lesson_2.level_2;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 8");
        System.out.println("Enter your name!");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

    }
}
