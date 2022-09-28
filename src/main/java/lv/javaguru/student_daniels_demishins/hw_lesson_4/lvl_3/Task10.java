package lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A > B && A > C) {
            System.out.println("Наибольшее " + A);
        } else if (B > A && B > C) {
            System.out.println("Наибольшее " + B);
        } else {
            System.out.println("Наибольшее " + C);
        }
    }
}
