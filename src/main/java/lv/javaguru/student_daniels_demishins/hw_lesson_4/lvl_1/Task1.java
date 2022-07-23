package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите целое число");
        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
}
