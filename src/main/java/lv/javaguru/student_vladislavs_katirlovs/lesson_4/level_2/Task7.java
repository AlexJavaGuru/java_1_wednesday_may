package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_2;

import java.util.Scanner;

class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 2 variables...");
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();

        String result;

        if (variableA == variableB) {
            result = "Numbers are equals";
        } else {
            result = "Variables are different";
        }

        System.out.println(result);
    }
}
