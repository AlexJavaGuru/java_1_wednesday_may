package lv.javaguru.student_alija_alijeva.lesson4.level_1.task_3;

import java.util.Scanner;

class Week {
    public static void main(String[] args) {
        Scanner numberOne = new Scanner(System.in);
        System.out.println("Your number from 1 to 7 ");
        int number = numberOne.nextInt();
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error");
        }
    }
}
