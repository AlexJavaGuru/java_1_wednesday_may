package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_6.Task_7_to_11;

import java.util.Objects;

class DayOfTheWeekTest {

    final DayOfTheWeekDetector subject = new DayOfTheWeekDetector();

    public static void main(String[] args) {
        DayOfTheWeekTest test = new DayOfTheWeekTest();

        test.DayOfTheWeekTestMonday();
        test.DayOfTheWeekTestTuesday();
        test.DayOfTheWeekTestWednesday();
        test.DayOfTheWeekTestThursday();
        test.DayOfTheWeekTestFriday();
        test.DayOfTheWeekTestSaturday();
        test.DayOfTheWeekTestSunday();
        test.noDayOfTheWeekTest();
    }

    void DayOfTheWeekTestMonday() {
        String result = subject.findDayOfTheWeek(1);
        check(Objects.equals(result, "Monday"), "Monday Test");
    }

    void DayOfTheWeekTestTuesday() {
        String result = subject.findDayOfTheWeek(2);
        check(Objects.equals(result, "Tuesday"), "Tuesday Test");
    }

    void DayOfTheWeekTestWednesday() {
        String result = subject.findDayOfTheWeek(3);
        check(Objects.equals(result, "Wednesday"), "Wednesday Test");
    }

    void DayOfTheWeekTestThursday() {
        String result = subject.findDayOfTheWeek(4);
        check(Objects.equals(result, "Thursday"), "Thursday Test");
    }

    void DayOfTheWeekTestFriday() {
        String result = subject.findDayOfTheWeek(5);
        check(Objects.equals(result, "Friday"), "Friday Test");
    }

    void DayOfTheWeekTestSaturday() {
        String result = subject.findDayOfTheWeek(6);
        check(Objects.equals(result, "Saturday"), "Saturday Test");
    }

    void DayOfTheWeekTestSunday() {
        String result = subject.findDayOfTheWeek(7);
        check(Objects.equals(result, "Sunday"), "Sunday Test");
    }

    void noDayOfTheWeekTest() {
        String result = subject.findDayOfTheWeek(0);
        check(Objects.equals(result, "Error number"), "No Day of the week Test");
    }

    void check(boolean result, String taskName) {
        if(result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
