package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type number a...");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("type number b...");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("type number c...");
        double thirdDoubleNumber = scanner.nextDouble();

        System.out.println("Arithmetic mean is " + (firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber) / 3);


    }
}
