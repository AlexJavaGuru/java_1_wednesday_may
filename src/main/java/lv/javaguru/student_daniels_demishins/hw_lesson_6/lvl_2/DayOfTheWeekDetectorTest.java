package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest testRunner = new DayOfTheWeekDetectorTest();
        testRunner.testIsMonday();
        testRunner.testIsTuesday();
        testRunner.testIsWednesday();
        testRunner.testIsThursday();
        testRunner.testIsFriday();
        testRunner.testIsSaturday();
        testRunner.testIsSunday();
        testRunner.testIsNotCorrectDay();
    }

    public void testIsMonday() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String expectedResult = "Monday";
        String actualResult = victim.findDayOfTheWeek(1);
        check(expectedResult, actualResult, "Monday Test");
    }

    public void testIsTuesday() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String expectedResult = "Tuesday";
        String actualResult = victim.findDayOfTheWeek(2);
        check(expectedResult, actualResult, "Tuesday Test");
    }

    public void testIsWednesday() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String expectedResult = "Wednesday";
        String actualResult = victim.findDayOfTheWeek(3);
        check(expectedResult, actualResult, "Wednesday Test");
    }

    public void testIsThursday() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String expectedResult = "Thursday";
        String actualResult = victim.findDayOfTheWeek(4);
        check(expectedResult, actualResult, "Thursday Test");
    }

    public void testIsFriday() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String expectedResult = "Friday";
        String actualResult = victim.findDayOfTheWeek(5);
        check(expectedResult, actualResult, "Friday Test");
    }

    public void testIsSaturday() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String expectedResult = "Saturday";
        String actualResult = victim.findDayOfTheWeek(6);
        check(expectedResult, actualResult, "Saturday Test");
    }

    public void testIsSunday() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String expectedResult = "Sunday";
        String actualResult = victim.findDayOfTheWeek(7);
        check(expectedResult, actualResult, "Sunday Test");
    }

    public void testIsNotCorrectDay() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String expectedResult = "Not correct day of week";
        String actualResult = victim.findDayOfTheWeek(8);
        check(expectedResult, actualResult, "Not correct day of week Test");
    }

    public void check(String actualResult, String expectedResult, String name) {
        if (expectedResult == actualResult) {
            System.out.println(name + " has successed!");
        } else {
            System.out.println(name + " has failed!");
            System.out.println("Expected : " + expectedResult + " ,but actual is : " + actualResult);
        }
    }
}
