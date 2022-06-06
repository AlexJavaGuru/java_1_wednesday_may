package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson_2;

import java.util.Scanner;

public class level_3_task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double first = scanner.nextInt();

        System.out.println("Enter the second number: ");
        double second = scanner.nextInt();

        System.out.println("Enter the third number: ");
        double third = scanner.nextInt();

        double ari = (first + second + third) / 3;

        System.out.println("Average arithmetic number = " + (first + second + third) / ari);

    }

}