package lv.javaguru.student_ivan_k.homework.lesson_6.level_4junior.task_19;

import java.util.Scanner;

public class WhileInfiniteLoopBreak {

    public static void main(String[] args) {

        boolean toContinion = true;
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
                    toContinion = false;
                    break;

            }
        }while (toContinion) ;
    }
}
