package lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_3;

import java.util.Scanner;

class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 3 variables...");
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();
        int variableC = scanner.nextInt();

        String result;

        if (variableA == variableB && variableB == variableC) {
            result = "All numbers are equal";
        } else if (variableA != variableB && variableB != variableC && variableA != variableC) {
            result = "All numbers are different";
        } else {
            result = "Neither all are equal or different";
        }
        System.out.println(result);
    }
}
