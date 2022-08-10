package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_2;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        testDetectDayNameV1();
        testDetectDayNameV2();
        testDetectDayNameV3();
    }

    public static void testDetectDayNameV1() {
        DayOfTheWeekDetectorIfVersion subject = new DayOfTheWeekDetectorIfVersion();

        check(subject.detectDayName(3).equals("Wednesday"), "testDetectDayNameV1");
    }

    public static void testDetectDayNameV2() {
        DayOfTheWeekDetectorIfVersionV2 subject = new DayOfTheWeekDetectorIfVersionV2();

        check(subject.detectDayName(3).equals("Wednesday"), "testDetectDayNameV2");
    }

    public static void testDetectDayNameV3() {
        DayOfTheWeekDetectorIfVersionV3 subject = new DayOfTheWeekDetectorIfVersionV3();

        check(subject.detectDayName(3).equals("Wednesday"), "testDetectDayNameV3");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
