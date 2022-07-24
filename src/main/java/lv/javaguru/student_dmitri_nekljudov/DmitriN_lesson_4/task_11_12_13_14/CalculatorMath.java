package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_11_12_13_14;

import java.util.Scanner;

class CalculatorMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Put number firstNumber and secondNumber");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("sum: " + calculator.sum(firstNumber, secondNumber));
        System.out.println("subtraction: " + calculator.subtraction(firstNumber, secondNumber));
        System.out.println("multiplication: " + calculator.multiplication(firstNumber, secondNumber));
        System.out.println("division: " + calculator.division(firstNumber, secondNumber));
    }

}

