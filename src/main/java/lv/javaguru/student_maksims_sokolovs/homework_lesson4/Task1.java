package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson4;

import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) { //просто от вас подсмотрел

            System.out.print("Enter a number... ");

            int number = scanner.nextInt();
            if (number > 7) {
                System.out.println("Number > 7");
            } else {
                System.out.println("Number < 7");

            }
        }
    }
}