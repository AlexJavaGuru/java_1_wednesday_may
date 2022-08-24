package lv.javaguru.student_anton_papin.lesson_2_homework.level_1;

import java.util.Scanner;

public class ScannerTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double numberA = scanner.nextDouble();
        double numberB = scanner.nextDouble();
        System.out.println( numberA + numberB );
        System.out.println( numberA - numberB );
        System.out.println( numberA * numberB );
        System.out.println( numberA / numberB );
    }
}
