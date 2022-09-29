package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {

    static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        try {
            userInput();
        } catch (Exception e) {
            System.out.println("Please enter number not word");
            userInput();

        }
    }
}
