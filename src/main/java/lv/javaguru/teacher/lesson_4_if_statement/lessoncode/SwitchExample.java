package lv.javaguru.teacher.lesson_4_if_statement.lessoncode;


import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

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
                break;
        }
    }
}
