package main.java.lv.javaguru.student_ArtjomsB_homework_2.lesson_2.homework.level_1_intern;
import java.util.Scanner;

public class Task_1_AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Input first number
        System.out.print("Please, input first number:");
        int firstNumber = inp.nextInt();
        //Input second number
        System.out.print("Please, input second number:");
        int secondNumber = inp.nextInt();
        //Sum output
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        //Subtraction output
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        //Multiply output
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        //Division output
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }
}

