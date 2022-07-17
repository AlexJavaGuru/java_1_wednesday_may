package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_1;

import java.util.Scanner;

class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number...");
        int variable = scanner.nextInt();

        String result;

        if (variable % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        System.out.println(result);
    }
}
