package lv.javaguru.student_vadim_zamjatin.lesson_2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println();

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);
    }

}
