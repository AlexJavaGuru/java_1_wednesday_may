package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.checkMonday();
        test.checkTuesday();
        test.checkWednesday();
        test.checkThursday();
        test.checkFriday();
        test.checkSaturday();
        test.checkSunday();
        test.checkNotCorrect();
    }


    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - Fail");
        }
    }

    DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

    public void checkMonday () {
        check(dayOfTheWeekDetector.findDayOfTheWeek(1).equals("Monday"), "Monday");
    }
    public void checkTuesday () {
        check(dayOfTheWeekDetector.findDayOfTheWeek(2).equals("Tuesday"), "Tuesday");

    }
    public void checkWednesday () {
        check(dayOfTheWeekDetector.findDayOfTheWeek(3).equals("Wednesday"), "Wednesday");
    }
    public void checkThursday () {
        check(dayOfTheWeekDetector.findDayOfTheWeek(4).equals("Thursday"), "Thursday");

    }
    public void checkFriday () {
        check(dayOfTheWeekDetector.findDayOfTheWeek(5).equals("Friday"), "Friday");

    }
    public void checkSaturday () {
        check(dayOfTheWeekDetector.findDayOfTheWeek(6).equals("Saturday"), "Saturday");

    }
    public void checkSunday () {
        check(dayOfTheWeekDetector.findDayOfTheWeek(7).equals("Sunday"), "Sunday");

    }
    public void checkNotCorrect () {
        check(dayOfTheWeekDetector.findDayOfTheWeek(8).equals("Not Correct"), "Not Correct");

    }
}

