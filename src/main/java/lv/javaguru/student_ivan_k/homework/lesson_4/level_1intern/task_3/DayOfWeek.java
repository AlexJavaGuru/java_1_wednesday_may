package lv.javaguru.student_ivan_k.homework.lesson_4.level_1intern.task_3;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 and found out day of the week!");
        System.out.println(" 1 - Monday");
        System.out.println(" 2 - Tuesday");
        System.out.println(" 3 - Wednesday");
        System.out.println(" 4 - Thursday");
        System.out.println(" 5 - Friday");
        System.out.println(" 6 - Saturday");
        System.out.println(" 7 - Sunday");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("You choosed Monday!");
                break;
            case 2:
                System.out.println("You choosed Tuesday!");
                break;
            case 3:
                System.out.println("You choosed Wednesday!");
                break;
            case 4:
                System.out.println("You choosed Thursday!");
                break;
            case 5:
                System.out.println("You choosed Friday!");
                break;
            case 6:
                System.out.println("You choosed Saturday!");
                break;
            case 7:
                System.out.println("You choosed Saturday!");
                break;
        }

    }
}
