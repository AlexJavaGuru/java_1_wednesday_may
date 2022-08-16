package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println("Increasing order");
        } else if (c > b && b > a) {
            System.out.println("Decreasing order");
        } else
            System.out.println("Neither increasing or decreasing order");

    }

}
