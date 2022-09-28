package lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите 2 целых числа");
        int A = Scanner.nextInt();
        int B = Scanner.nextInt();

        if (A < B) {
            System.out.println("Наименьшее " + A);
        } else
            System.out.println("Наименьшее " + B);
    }
}
