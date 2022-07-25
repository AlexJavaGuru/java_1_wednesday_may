package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_1intern.task_4;


import java.util.Scanner;

public class evenOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int number = scanner.nextInt();
        int result = number % 2;

        if ( result > 0){
            System.out.println(" Your number is not even");
        } else {
            System.out.println("Your number is even");
        }
    }
}
