package main.java.lv.javaguru.student_andrei_de.Homework.lesson4;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

    }

    public int plus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Число четное");
            return true;
        } else {
            System.out.println("Число нечетное");
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("Max number is:");
            System.out.print(firstNumber);
            return firstNumber;
        } else if (firstNumber == secondNumber) {
            System.out.println("Number is equals");
            return firstNumber;
        } else {
            System.out.println("Max number is:");
            System.out.print(secondNumber);
            return secondNumber;
        }

    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Max number is:");
            System.out.println(firstNumber);
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Max number is:");
            System.out.println(secondNumber);
            return secondNumber;
        }
        return firstNumber;
    }
}


