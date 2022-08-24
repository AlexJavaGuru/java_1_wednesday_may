package lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_2;

import java.util.Scanner;

public class MoreLess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number more than 0");
        } else if (number < 0) {
            System.out.println("Number less than 0");
        } else {
            System.out.println("Number is 0");
        }
    }
}
