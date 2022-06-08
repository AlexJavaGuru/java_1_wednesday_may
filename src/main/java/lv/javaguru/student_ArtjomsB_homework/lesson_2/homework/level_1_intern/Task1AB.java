package main.java.lv.javaguru.student_ArtjomsB_homework.lesson_2.homework.level_1_intern;
import java.util.Scanner;

public class Task1AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please, input first number:");
        int firstNumber = inp.nextInt();
        System.out.print("Please, input second number:");
        int secondNumber = inp.nextInt();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }
}

