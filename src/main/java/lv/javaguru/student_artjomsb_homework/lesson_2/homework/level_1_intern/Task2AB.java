package lv.javaguru.student_artjomsb_homework.lesson_2.homework.level_1_intern;
import java.util.Scanner;

public class Task2AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please, enter the first number:");
        double firstNumber = inp.nextDouble();
        System.out.print("Please, enter the second number:");
        double secondNumber = inp.nextDouble();
        String divide = String.format("%.2f",(firstNumber / secondNumber));
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + "/" + secondNumber + " = " + divide);
    }
}
