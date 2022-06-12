package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_2.lvl_3;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result= a+b+c;
        System.out.println("Средние арифметическое = " +result /3 );

    }
}
