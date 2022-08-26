package lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_2;

import java.util.Scanner;

public class StringScan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
