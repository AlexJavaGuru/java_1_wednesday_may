package lv.javaguru.student_eugene_sheinin.homework.lesson_2.level_3.task_9;

import java.util.Scanner;

public class MultTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int number:");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
