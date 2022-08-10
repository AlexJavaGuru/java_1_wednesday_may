package main.java.lv.javaguru.student_vadim_zamjatin.lesson_4.Calculator;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divise(int firstNumber, int secondNumber) {
        return firstNumber / (double) secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;

    }

}