package lv.javaguru.student_alija_alijeva.lesson4.level_1.task_2;

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner numberOne = new Scanner(System.in);
        System.out.println("Your number is ");
        int number = numberOne.nextInt();
        if (number > 0) {
            System.out.println("Your number is positive");
        } else if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is zero");
        }

    }
}
