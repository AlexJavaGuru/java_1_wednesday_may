package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_4.level_1;

import java.util.Scanner;

class IntOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
