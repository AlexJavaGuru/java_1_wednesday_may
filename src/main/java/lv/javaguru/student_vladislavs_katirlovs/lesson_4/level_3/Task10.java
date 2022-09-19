package lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_3;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 3 numbers...");
        int varA = scanner.nextInt();
        int varB = scanner.nextInt();
        int varC = scanner.nextInt();

        String result;

        if (varA > varB) {
            if (varA > varC) {
                result = varA + " is the biggest";
            } else if (varC > varA) {
                result = varC + " is the biggest";
            } else {
                result = varA + " and " + varC + " are the biggest";
            }
        } else if (varB > varC) {
            if (varB > varA) {
                result = varB + " is the biggest";
            } else {
                result = varA + " and " + varB + " are the biggest";
            }
        } else if (varC > varB) {
            result = varC + " is the biggest";
        } else {
            if (varA == varC) {
                result = "All 3 numbers are equal";
            } else {
                result = varB + " and " + varC + " are the biggest";
            }
        }

        System.out.println(result);
    }
}
