package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_2_intern;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest runner = new DayOfTheWeekDetectorTest();
        runner.testWrongInputOne();
        runner.testWrongInputTwo();
        runner.testCorrectInputOne();
        runner.testCorrectInputTwo();
    }
    void testWrongInputOne(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String actualResult = detector.detectDayName(0);
        check(expectedResult.equals(actualResult), "Test check wrong input one");
    }
    void testWrongInputTwo(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String actualResult = detector.detectDayName(8);
        check(expectedResult.equals(actualResult), "Test check wrong input two");
    }
    void testCorrectInputOne(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Monday";
        String actualResult = detector.detectDayName(1);
        check(expectedResult.equals(actualResult), "Test check correct input one");
    }
    void testCorrectInputTwo(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Sunday";
        String actualResult = detector.detectDayName(7);
        check(expectedResult.equals(actualResult), "Test check correct input two");
    }
    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
