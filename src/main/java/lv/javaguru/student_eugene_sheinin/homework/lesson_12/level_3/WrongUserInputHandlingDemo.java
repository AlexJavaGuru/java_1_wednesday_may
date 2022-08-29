package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit;

        try {
            digit = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Not integer! Try again");
            scanner.next();
            digit = scanner.nextInt();
        }

        System.out.println("Entered digit " + digit);

    }
}
