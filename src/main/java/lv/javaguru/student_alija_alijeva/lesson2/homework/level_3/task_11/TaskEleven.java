package main.java.lv.javaguru.student_alija_alijeva.lesson2.homework.level_3.task_11;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number one ");
        int num1 = scanner.nextInt();
        System.out.println("Number two ");
        int num2 = scanner.nextInt();
        System.out.println("Number three ");
        int num3 = scanner.nextInt();
        double res = ((double)(num1 + num2 + num3))/3;
        System.out.println("Result: " + res);

    }
}
