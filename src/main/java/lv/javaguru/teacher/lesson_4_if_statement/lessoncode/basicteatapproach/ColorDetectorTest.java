package main.java.lv.javaguru.teacher.lesson_4_if_statement.lessoncode.basicteatapproach;

public class ColorDetectorTest {

    public static void main(String[] args) {
        ColorDetectorTest runner = new ColorDetectorTest();
        runner.testRedColorStartRange();
        runner.testRedColorEndRange();
        runner.testResultLengthMustBeBlue();
    }

    public void testRedColorStartRange() {
        ColorDetector subject = new ColorDetector();
        int waveLength = 401;
        String expectedResult = "Red";
        String actualResult = subject.detect(waveLength);
        check(expectedResult, actualResult, "Test Red Start Range");
    }

    public void testRedColorEndRange() {
        ColorDetector subject = new ColorDetector();
        int waveLength = 500;
        String expectedResult = "Red";
        String actualResult = subject.detect(waveLength);
        check(expectedResult, actualResult, "Test Red End Range");
    }

    public void testResultLengthMustBeBlue() {
        ColorDetector subject = new ColorDetector();
        int waveLength = 501;
        String expectedResult = "Blue";
        String actualResult = subject.detect(waveLength);
        check(expectedResult, actualResult, "Test Blue");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
