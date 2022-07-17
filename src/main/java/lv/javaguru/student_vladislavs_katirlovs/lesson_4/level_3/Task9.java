package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_3;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 3 variables...");
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();
        int variableC = scanner.nextInt();

        String result;

        if (variableC > variableB) {
            if (variableB > variableA) {
                result = "increasing";
            } else {
                result = "Neither increasing or decreasing order";
            }
        } else if (variableB < variableA) {
            result = "decreasing";
        } else {
            result = "Neither increasing or decreasing order";
        }

        System.out.println(result);
    }
}
