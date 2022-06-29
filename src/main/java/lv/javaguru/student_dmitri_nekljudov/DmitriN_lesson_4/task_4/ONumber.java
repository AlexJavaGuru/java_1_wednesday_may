package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_4;

import java.util.Scanner;

public class ONumber {


    public static void main(String[] args) {

        System.out.print(" Number: ");
        Scanner scanner = new Scanner(System.in);
        int numeric = scanner.nextInt();


        if (numeric % 2 == 0) {
            System.out.println(" paarisarv : ");
        } else {
            System.out.println(" paaritu number: ");
        }
    }
}
