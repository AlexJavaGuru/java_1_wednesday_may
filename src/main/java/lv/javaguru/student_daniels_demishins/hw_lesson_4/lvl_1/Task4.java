package lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число чётное");
        } else
            System.out.println("Число не чётное");
    }
}


