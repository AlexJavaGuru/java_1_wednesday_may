package lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_1;

import java.util.Scanner;

class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number between 1 and 7...");
        int day = scanner.nextInt();

        String result;

        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else if (day == 7) {
            result = "Sunday";
        } else  {
            result = "Error... Your number is not between 1 and 7";
        }

        System.out.println(result);
    }
}

