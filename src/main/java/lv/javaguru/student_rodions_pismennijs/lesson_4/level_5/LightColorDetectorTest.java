package lv.javaguru.student_rodions_pismennijs.lesson_4.level_5;

import java.util.Objects;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.testViolet();
        test.testBlue();
        test.testGreen();
        test.testYellow();
        test.testOrange();
        test.testRedStart();
        test.testRedEnd();
    }

    public void check(String expectResult, String actualResult, String testName) {
        if (Objects.equals(expectResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + expectResult + " but actual is: " + actualResult);
        }
    }

    public void testViolet() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 380;
        String expectResult = "Violet";
        String actualResult = subject.detect(waveLength);
        check(expectResult, actualResult, "Test Violet");
    }

    public void testBlue() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 450;
        String expectResult = "Blue";
        String actualResult = subject.detect(waveLength);
        check(expectResult, actualResult, "Test Blue");
    }

    public void testGreen() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 495;
        String expectResult = "Green";
        String actualResult = subject.detect(waveLength);
        check(expectResult, actualResult, "Test Green");
    }

    public void testYellow() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 570;
        String expectResult = "Yellow";
        String actualResult = subject.detect(waveLength);
        check(expectResult, actualResult, "Test Yellow");
    }

    public void testOrange() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 590;
        String expectResult = "Orange";
        String actualResult = subject.detect(waveLength);
        check(expectResult, actualResult, "Test Orange");
    }

    public void testRedStart() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 620;
        String expectResult = "Red";
        String actualResult = subject.detect(waveLength);
        check(expectResult, actualResult, "Test Red Start");
    }

    public void testRedEnd() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 750;
        String expectResult = "Red";
        String actualResult = subject.detect(waveLength);
        check(expectResult, actualResult, "Test Red End");
    }
}
