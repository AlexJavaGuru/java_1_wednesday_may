package lv.javaguru.student_vadim_zamjatin.lesson_4;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two even number please");

        int a;
        int b;
        int min;

        System.out.println("Number A");
        a = sc.nextInt();
        System.out.println("Number B");
        b = sc.nextInt();

        min = a;
        if (b < min) {
            min = b;
            System.out.println("Min = " + min);

        } else {
            System.out.println("Min = " + min);
        }
    }

}

