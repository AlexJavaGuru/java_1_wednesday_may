package main.java.lv.javaguru.student_maksims_sokolovs;

import java.util.Scanner;

public class level_1_task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secondDoubleNumber = scanner.nextDouble();

        double add = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mul = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println("The result of addition = " + ( firstDoubleNumber + secondDoubleNumber));
        System.out.println("The result of subtraction = " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("The result of multiplication = " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Division result = " + (firstDoubleNumber / secondDoubleNumber));

    }

}

