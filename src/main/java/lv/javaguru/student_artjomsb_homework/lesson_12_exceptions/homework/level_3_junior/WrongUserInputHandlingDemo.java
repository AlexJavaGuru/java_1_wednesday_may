package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_3_junior;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input number - ");
                int a = scanner.nextInt();
                System.out.println("Good job, you did this!!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("1234567890 - numbers, abcdefg... - not numbers");
                System.out.println("Try again, I believe in you");
            }
        }
    }
}
