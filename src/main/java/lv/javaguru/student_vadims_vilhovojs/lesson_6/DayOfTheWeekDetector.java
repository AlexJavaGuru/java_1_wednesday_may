package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_6;

import java.util.Scanner;

class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        if (dayNumber == 1) {
            String dayOfTheWeek = "Monday";
            return dayOfTheWeek;
        } else if (dayNumber == 2) {
            String dayOfTheWeek = "Tuesday";
            return dayOfTheWeek;
        } else if (dayNumber == 3) {
            String dayOfTheWeek = "Wednesday";
            return dayOfTheWeek;
        } else if (dayNumber == 4) {
            String dayOfTheWeek = "Thursday";
            return dayOfTheWeek;
        } else if (dayNumber == 5) {
            String dayOfTheWeek = "Friday";
            return dayOfTheWeek;
        } else if (dayNumber == 6) {
            String dayOfTheWeek = "Saturday";
            return dayOfTheWeek;
        } else if (dayNumber == 7) {
            String dayOfTheWeek = "Sunday";
            return dayOfTheWeek;
        } else {
            String dayOfTheWeek = "Not correct day number";
            return dayOfTheWeek;

        }


    }


}








