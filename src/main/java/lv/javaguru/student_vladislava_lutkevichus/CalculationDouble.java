package main.java.lv.javaguru.student_vladislava_lutkevichus;
import java.util.Scanner;

public class CalculationDouble {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Addition: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Subtraction: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Multiplication: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Division: " + (firstDoubleNumber / secondDoubleNumber));
    }
}
