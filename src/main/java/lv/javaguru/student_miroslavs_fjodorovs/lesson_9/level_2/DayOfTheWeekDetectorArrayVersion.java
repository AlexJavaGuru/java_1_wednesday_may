package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number > 0 && number <=7) {
            return array[number - 1];
        }
        return "Please input a valid number between 1 and 7";
    }
}
