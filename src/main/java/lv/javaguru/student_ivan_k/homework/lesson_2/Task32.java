package lv.javaguru.student_ivan_k.homework.lesson_2;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        System.out.print("Hello, enter your name please : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello ," + name+"!");
        System.out.println("How old are you?");
        System.out.println("Enter your Year of Birth.   And I'll count myself!");
        int yearOfBirh = scanner.nextInt();
        int age = 2022 - yearOfBirh;
        System.out.println("You are "+ age +" years old");

    }
}
