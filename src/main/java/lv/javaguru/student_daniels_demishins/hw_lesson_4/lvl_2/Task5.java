package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите 2 целых числа");
        int A = Scanner.nextInt();
        int B = Scanner.nextInt();

        if (A > B) {
            System.out.println("Наибольшее " + A);
        } else
            System.out.println("Наибольшее " + B);
    }
}
