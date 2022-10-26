package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_2;

class DayOfTheWeekDetectorSwitchVersionTest {

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

    static DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();

    static void mondayTest() {
        check(dayOfTheWeekDetectorSwitchVersion.detectDayName(1).equals("Monday"), "Monday Test");
    }

    static void tuesdayTest() {
        check(dayOfTheWeekDetectorSwitchVersion.detectDayName(2).equals("Tuesday"), "Tuesday Test");
    }

    static void wednesdayTest() {
        check(dayOfTheWeekDetectorSwitchVersion.detectDayName(3).equals("Wednesday"), "Wednesday Test");
    }

    static void thursdayTest() {
        check(dayOfTheWeekDetectorSwitchVersion.detectDayName(4).equals("Thursday"), "Thursday Test");
    }

    static void fridayTest() {
        check(dayOfTheWeekDetectorSwitchVersion.detectDayName(5).equals("Friday"), "Friday Test");
    }

    static void saturdayTest() {
        check(dayOfTheWeekDetectorSwitchVersion.detectDayName(6).equals("Saturday"), "Saturday Test");
    }

    static void sundayTest() {
        check(dayOfTheWeekDetectorSwitchVersion.detectDayName(7).equals("Sunday"), "Sunday Test");
    }

    static void incorrectDayTest() {
        check(dayOfTheWeekDetectorSwitchVersion.detectDayName(8).equals("Please input a valid number between 1 and 7"), "Incorrect Day Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
