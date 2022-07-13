package main.java.lv.javaguru.student_vadim_zamjatin.lesson_4;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Input even number A");
        a = sc.nextInt();
        System.out.println("Input even number B");
        b = sc.nextInt();

        if (a == b) {
            System.out.println("Numbers are equals");
    } else {
            System.out.println("Numbers are different");
        }
    }

}
