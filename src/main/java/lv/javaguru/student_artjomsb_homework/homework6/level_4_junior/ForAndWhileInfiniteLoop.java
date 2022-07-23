package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_4_junior;

import java.util.Scanner;

class ForAndWhileInfiniteLoop {
    public static void main(String[] args) {

        if (userChooseLoop() == 1) {
            infiniteForLoop();
        } else {
            infiniteWhileLoop();
        }
    }

    private static void infiniteForLoop() {
        for (int i = 0; i >= 0; i++) {
            System.out.println("Welcome to infinite for loop");
        }
    }

    private static void infiniteWhileLoop() {
        while (true) {
            System.out.println("Welcome to infinite while loop");
        }
    }

    private static int userChooseLoop() {
        Scanner userChoice = new Scanner(System.in);
        System.out.print("Please choose the loop, 1 - for loop,other numbers - while loop: ");
        return userChoice.nextInt();
    }
}
