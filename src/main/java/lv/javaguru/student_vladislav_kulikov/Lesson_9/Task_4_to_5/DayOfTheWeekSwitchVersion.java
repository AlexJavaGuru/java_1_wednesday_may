package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_4_to_5;

class DayOfTheWeekSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int numberOfTheDay){
        return switch (numberOfTheDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please input a valid number between 1 and 7";
        };
    }
}
