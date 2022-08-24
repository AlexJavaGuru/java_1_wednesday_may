package lv.javaguru.student_rodions_pismennijs.lesson_4.level_3;

import java.util.Scanner;

class ThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First: ");
        int first = scanner.nextInt();
        System.out.print("Second: ");
        int second = scanner.nextInt();
        System.out.print("Third: ");
        int third = scanner.nextInt();

        if (first == second && second == third) {
            System.out.println("All numbers are equal");
        } else if (first != second && first != third && second != third) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        if (first < second && second < third) {
            System.out.println("Increasing order");
        } else if (first > second && second > third) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

        if (first > second && first > third) {
            System.out.println("Max num is " + first);
        } else if (second > first && second > third) {
            System.out.println("Max num is " + second);
        } else {
            System.out.println("Max num is " + third);
        }
    }
}
