package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_3;

import java.util.Scanner;

class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 3 variables...");
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();
        int variableC = scanner.nextInt();

        String result;

        if (variableA == variableB) {
            if (variableB == variableC) {
                result = "All numbers are equal";
            } else {
                result = "Neither all are equal or different";
            }
        } else if (variableA == variableC) {
            result = "Neither all are equal or different";
        } else if (variableB == variableC) {
            result = "Neither all are equal or different";
        } else {
            result = "All numbers are different";
        }

        System.out.println(result);
    }
}
