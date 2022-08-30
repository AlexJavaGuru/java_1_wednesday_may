package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_1_intern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo extends Exception {
    public static void main(String[] args) {
        int num;
        try {
            num = userInput();
            System.out.println(num / 0);
        } catch (InputMismatchException e) {
            System.out.println("Maybe you input number?");
        } catch (ArithmeticException e) {
            System.out.println("Why we can't divide on zero (((");
        } finally {
            System.out.println("This message makes no sense");
        }
    }

    static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number - ");
        return scanner.nextInt();
    }
}
