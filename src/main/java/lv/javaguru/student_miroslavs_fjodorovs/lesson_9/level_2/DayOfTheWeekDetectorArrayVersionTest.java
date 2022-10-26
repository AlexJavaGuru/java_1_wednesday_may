package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_2;

class DayOfTheWeekDetectorArrayVersionTest {

    public static void main(String[] args) {
        mondayTest();
        tuesdayTest();
        wednesdayTest();
        thursdayTest();
        fridayTest();
        saturdayTest();
        sundayTest();
        incorrectDayTest();
    }

    static DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();

    static void mondayTest() {
        check(dayOfTheWeekDetectorArrayVersion.detectDayName(1).equals("Monday"), "Monday Test");
    }

    static void tuesdayTest() {
        check(dayOfTheWeekDetectorArrayVersion.detectDayName(2).equals("Tuesday"), "Tuesday Test");
    }

    static void wednesdayTest() {
        check(dayOfTheWeekDetectorArrayVersion.detectDayName(3).equals("Wednesday"), "Wednesday Test");
    }

    static void thursdayTest() {
        check(dayOfTheWeekDetectorArrayVersion.detectDayName(4).equals("Thursday"), "Thursday Test");
    }

    static void fridayTest() {
        check(dayOfTheWeekDetectorArrayVersion.detectDayName(5).equals("Friday"), "Friday Test");
    }

    static void saturdayTest() {
        check(dayOfTheWeekDetectorArrayVersion.detectDayName(6).equals("Saturday"), "Saturday Test");
    }

    static void sundayTest() {
        check(dayOfTheWeekDetectorArrayVersion.detectDayName(7).equals("Sunday"), "Sunday Test");
    }

    static void incorrectDayTest() {
        check(dayOfTheWeekDetectorArrayVersion.detectDayName(8).equals("Please input a valid number between 1 and 7"), "Incorrect Day Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}