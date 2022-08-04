package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_2_intern;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        if (number > 0 && number < 8) {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            return days[number - 1];
        }
        return "Please input a valid number between 1 and 7";
    }
}
