package main.java.lv.javaguru.student_ArtjomsB_homework.lesson_2.homework.level_1_intern;
import java.util.Scanner;

public class Task_2_AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //First number input
        System.out.print("Please, enter the first number:");
        double firstNumber = inp.nextDouble();
        //Second number input
        System.out.print("Please, enter the second number:");
        double secondNumber = inp.nextDouble();
        //Only 2 numbers after comma
        String divide = String.format("%.2f",(firstNumber / secondNumber));
        //Sum output
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        //Subtraction output
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        //Multiply output
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        //Division output
        System.out.println(firstNumber + "/" + secondNumber + " = " + divide);
    }
}
