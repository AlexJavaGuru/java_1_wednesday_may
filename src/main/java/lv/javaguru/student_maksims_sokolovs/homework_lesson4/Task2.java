package lv.javaguru.student_maksims_sokolovs.homework_lesson4;

import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("Enter a number... ");

            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Number > 0");
            } else if (number < 0) {
                System.out.println("Number < 0");
            } else {
                System.out.println("Number = 0");

            }
        }
    }
}