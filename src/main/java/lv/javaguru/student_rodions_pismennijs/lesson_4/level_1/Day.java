package lv.javaguru.student_rodions_pismennijs.lesson_4.level_1;

import java.util.Scanner;

class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type number from 1 to 7: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
