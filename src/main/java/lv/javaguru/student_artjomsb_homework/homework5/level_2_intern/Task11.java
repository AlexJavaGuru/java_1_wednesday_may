package main.java.lv.javaguru.student_artjomsb_homework.homework5.level_2_intern;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " = " + numbers[i]);
        }
    }
}
