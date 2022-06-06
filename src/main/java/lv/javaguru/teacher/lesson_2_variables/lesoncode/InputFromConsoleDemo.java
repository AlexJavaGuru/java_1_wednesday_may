package main.java.lv.javaguru.teacher.lesson_2_variables.lesoncode;

import java.util.Scanner;
import java.util.SortedMap;

public class InputFromConsoleDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type variable a...");
        int a = scanner.nextInt();
        System.out.println("Type variable b...");
        int b = scanner.nextInt();

        int result = a + b;
        System.out.println("Result - " + result);

    }
}
