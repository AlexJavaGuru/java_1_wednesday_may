package lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_4;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
