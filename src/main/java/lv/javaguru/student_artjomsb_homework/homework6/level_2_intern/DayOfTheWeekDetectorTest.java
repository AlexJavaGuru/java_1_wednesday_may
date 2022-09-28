package lv.javaguru.student_artjomsb_homework.homework6.level_2_intern;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        testMonday();
        testTuesday();
        testWednesday();
        testThursday();
        testFriday();
        testSaturday();
        testSunday();
        testWrongNumber();
    }
    private static void testMonday (){
      DayOfTheWeekDetector tester = new DayOfTheWeekDetector();
      check(tester.findDayOfTheWeek(1).equals("Monday"), "Test first day");
    }
    private static void testTuesday (){
        DayOfTheWeekDetector tester = new DayOfTheWeekDetector();
        check(tester.findDayOfTheWeek(2).equals("Tuesday"), "Test second day");
    }
    private static void testWednesday (){
        DayOfTheWeekDetector tester = new DayOfTheWeekDetector();
        check(tester.findDayOfTheWeek(3).equals("Wednesday"), "Test third day");
    }
    private static void testThursday (){
        DayOfTheWeekDetector tester = new DayOfTheWeekDetector();
        check(tester.findDayOfTheWeek(4).equals("Thursday"), "Test fourth day");
    }
    private static void testFriday (){
        DayOfTheWeekDetector tester = new DayOfTheWeekDetector();
        check(tester.findDayOfTheWeek(5).equals("Friday"), "Test fifth day");
    }
    private static void testSaturday (){
        DayOfTheWeekDetector tester = new DayOfTheWeekDetector();
        check(tester.findDayOfTheWeek(6).equals("Saturday"), "Test sixth day");
    }
    private static void testSunday (){
        DayOfTheWeekDetector tester = new DayOfTheWeekDetector();
        check(tester.findDayOfTheWeek(7).equals("Sunday"), "Test seventh day");
    }
    private static void testWrongNumber (){
        DayOfTheWeekDetector tester = new DayOfTheWeekDetector();
        check(tester.findDayOfTheWeek(0).equals("Not correct day number"), "Test wrong day");
    }
    private static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test " + testName + ", Passed");
        } else {
            System.out.println("Test " + testName + ", Failed");
        }
    }
}
