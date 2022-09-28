package lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа");
        int A = Scanner.nextInt();
        int B = Scanner.nextInt();
        int C = Scanner.nextInt();

        if (A == B && A == C) {
            System.out.println("Numbers are equal");
        } else if (A != B && A != C) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Neither all are equal or different");

        }
    }
}
