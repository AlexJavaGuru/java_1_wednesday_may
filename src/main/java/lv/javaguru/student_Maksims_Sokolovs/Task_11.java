package main.java.lv.javaguru.student_Maksims_Sokolovs;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextInt();
        System.out.print("Enter second num: ");
        second = num.nextInt();
        result = first + second;
        System.out.println("Result is - " + result);
    }
}