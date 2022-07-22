package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_5;

import java.util.Scanner;

class Winner {

    public static void main(String[] args) {

        System.out.print("write 2 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numberO = scanner.nextInt();
        int numberT = scanner.nextInt();

        if (numberO > numberT) {
            System.out.println("biggest number: " + numberO);
        } else {
            System.out.println("biggest number: " + numberT);
        }
    }
}