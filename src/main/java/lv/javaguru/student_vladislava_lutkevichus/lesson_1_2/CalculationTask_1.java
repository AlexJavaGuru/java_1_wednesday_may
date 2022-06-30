package main.java.lv.javaguru.student_vladislava_lutkevichus.lesson_1_2;
import java.util.Scanner;

public class CalculationTask_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextInt();

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));
    }


}
