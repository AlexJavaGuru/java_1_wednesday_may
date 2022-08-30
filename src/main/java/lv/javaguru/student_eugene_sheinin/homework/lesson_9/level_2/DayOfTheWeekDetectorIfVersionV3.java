package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_2;

public class DayOfTheWeekDetectorIfVersionV3 implements DayOfTheWeekDetector{

    public String detectDayName(int number) {

        String[] week = new String[7];

        week[0] = "Monday";
        week[1] = "Tuesday";
        week[2] = "Wednesday";
        week[3] = "Thursday";
        week[4] = "Friday";
        week[5] = "Saturday";
        week[6] = "Sunday";

        return (number >= 1 && number <=7) ? week[number - 1] : "Please input a valid number between 1 and 7";

    }
}
