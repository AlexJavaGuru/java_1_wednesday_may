package lv.javaguru.teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Scanner;

public class BasicMenuApproach {

    public static void main(String[] args) {

        boolean toContinue = true;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Select option...");
            System.out.println("1 - New Product");
            System.out.println("2 - Search Product");
            System.out.println("3 - Delete Product");
            System.out.println("4 - Exit");

            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Type product parameters...");
                    break;
                case 2:
                    System.out.println("Select parameter for search");
                    break;
                case 3:
                    System.out.println("Enter product ID to delete");
                    break;
                case 4:
                    System.out.println("Good bye");
                    toContinue = false;
                    break;
            }
        } while (toContinue);
    }
}
