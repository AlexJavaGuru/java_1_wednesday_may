package lv.javaguru.student_vladislav_kulikov.Lesson_6.Task_7_to_11;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    String findDayOfTheWeek(int dayNumber) {
        String result = "";
        if(dayNumber == 1){
            result = "Monday";
        } else if (dayNumber == 2) {
            result = "Tuesday";
        } else if (dayNumber == 3) {
            result = "Wednesday";
        } else if (dayNumber == 4) {
            result = "Thursday";
        } else if (dayNumber == 5) {
            result = "Friday";
        } else if (dayNumber == 6) {
            result = "Saturday";
        } else if (dayNumber == 7) {
            result = "Sunday";
        } else {
            result = "Error number";
        }
        return result;
    }
}
