package lv.javaguru.student_rodions_pismennijs.lesson_9.level_2;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    public String detectDayName(int number) {
        if (number > 0 && number <= 7) {
            return array[number - 1];
        }
        return "Please input a valid number between 1 and 7";
    }
}
