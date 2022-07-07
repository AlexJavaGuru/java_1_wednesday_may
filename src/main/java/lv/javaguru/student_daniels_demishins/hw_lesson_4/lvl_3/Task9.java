package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A > B && B > C) {
            System.out.println("Increasing order");
        } else if (C > B && B > A) {
            System.out.println("Decreasing order");
        } else
            System.out.println("Neither increasing or decreasing order");

    }

}
