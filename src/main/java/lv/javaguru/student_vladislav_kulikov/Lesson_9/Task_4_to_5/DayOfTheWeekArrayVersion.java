package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_4_to_5;

class DayOfTheWeekArrayVersion implements DayOfTheWeekDetector {



    @Override
    public String detectDayName(int numberOfTheDay) {
        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        return switch (numberOfTheDay){
            case 1 -> array[0];
            case 2 -> array[1];
            case 3 -> array[2];
            case 4 -> array[3];
            case 5 -> array[4];
            case 6 -> array[5];
            case 7 -> array[6];
            default -> "Please input a valid number between 1 and 7";
        };
    }
}
