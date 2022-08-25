package lv.javaguru.student_rodions_pismennijs.lesson_4.level_2;

import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int first = scanner.nextInt();
        System.out.print("Second number: ");
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println("Max num is " + first);
        } else {
            System.out.println("Max num is " + second);
        }

        if (first < second) {
            System.out.println("Min num is " + first);
        } else {
            System.out.println("Min num is " + second);
        }

        if (first == second) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
