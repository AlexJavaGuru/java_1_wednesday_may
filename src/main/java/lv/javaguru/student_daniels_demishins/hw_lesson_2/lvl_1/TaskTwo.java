package lv.javaguru.student_daniels_demishins.hw_lesson_2.lvl_1;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println(firstDoubleNumber + secondDoubleNumber);

        double threeDoubleNumber = scanner.nextDouble();
        double fourDoubleNumber = scanner.nextDouble();
        System.out.println(firstDoubleNumber - secondDoubleNumber);

        double fiveDoubleNumber = scanner.nextDouble();
        double sixDoubleNumber = scanner.nextDouble();
        System.out.println(firstDoubleNumber * secondDoubleNumber);

        double sevenDoubleNumber = scanner.nextDouble();
        double eightDoubleNumber = scanner.nextDouble();
        System.out.println(firstDoubleNumber / secondDoubleNumber);

    }
}
