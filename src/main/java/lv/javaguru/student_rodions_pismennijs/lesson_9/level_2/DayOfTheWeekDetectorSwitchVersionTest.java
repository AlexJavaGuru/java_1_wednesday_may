package main.java.lv.javaguru.student_rodions_pismennijs.lesson_9.level_2;

class DayOfTheWeekDetectorSwitchVersionTest {

    public static void main(String[] args) {
        checkMonday();
        checkTuesday();
        checkWednesday();
        checkThursday();
        checkFriday();
        checkSaturday();
        checkSunday();
        checkNotCorrect();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static DayOfTheWeekDetectorSwitchVersion test = new DayOfTheWeekDetectorSwitchVersion();

    static void checkMonday() {
        check(test.detectDayName(1).equals("Monday"), "Monday");
    }

    static void checkTuesday() {
        check(test.detectDayName(2).equals("Tuesday"), "Tuesday");
    }

    static void checkWednesday() {
        check(test.detectDayName(3).equals("Wednesday"), "Wednesday");
    }

    static void checkThursday() {
        check(test.detectDayName(4).equals("Thursday"), "Thursday");
    }

    static void checkFriday() {
        check(test.detectDayName(5).equals("Friday"), "Friday");
    }

    static void checkSaturday() {
        check(test.detectDayName(6).equals("Saturday"), "Saturday");
    }

    static void checkSunday() {
        check(test.detectDayName(7).equals("Sunday"), "Sunday");
    }

    static void checkNotCorrect() {
        check(test.detectDayName(8).equals("Please input a valid number between 1 and 7"), "Not correct");
    }
}
