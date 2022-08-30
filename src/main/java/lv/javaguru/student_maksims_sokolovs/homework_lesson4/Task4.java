package lv.javaguru.student_maksims_sokolovs.homework_lesson4;

import java.util.Scanner;

class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Enter a number... ");

            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("The Number is even");
            } else {
                System.out.println("The Number is not even");

            }
        }
    }
}