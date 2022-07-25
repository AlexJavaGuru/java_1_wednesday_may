package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_1;

import java.util.Scanner;

class Task1And2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a variable...");
        int variable = scanner.nextInt();

        String result;

        if (variable > 0) {
            result = "Positive";
        } else if (variable < 0){
            result = "Negative";
        } else {
            result = "Zero";
        }

        System.out.println("Your variable is " + result);
    }
}
