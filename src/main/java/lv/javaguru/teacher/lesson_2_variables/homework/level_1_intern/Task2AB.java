package main.java.lv.javaguru.teacher.lesson_2_variables.homework.level_1_intern;
import java.util.Scanner;

public class Task2AB {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    //zapros pervogo chisla
    System.out.print("vvedite pervoe chislo:");
    double firstNumber = inp.nextDouble();
    //zapros vtorogo chisla
    System.out.print("vvedite vtoroe chislo:");
    double secondNumber = inp.nextDouble();
    String divide = String.format("%.2f",(firstNumber / secondNumber));
    //vivod summi
    System.out.println("Summa = " + (firstNumber + secondNumber));
    //vivod vichitanija
    System.out.println("Vichitanie = " + (firstNumber - secondNumber));
    //vivod umnozhenija
    System.out.println("Umnozhenie = " + (firstNumber * secondNumber));
    //vivod delenija
    System.out.println("Delenie = " + divide);
    }
}
