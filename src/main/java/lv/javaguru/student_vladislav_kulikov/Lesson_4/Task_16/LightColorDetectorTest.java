package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_16;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.lightColorDetectorOne();
        lightColorDetector.lightColorDetectorTwo();
        lightColorDetector.lightColorDetectorThree();
        lightColorDetector.lightColorDetectorFour();
        lightColorDetector.lightColorDetectorFive();
        lightColorDetector.lightColorDetectorSix();
    }

    public void lightColorDetectorOne() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 449;
        String expectedResult = "Violet";
        String realResult = lightColorDetector.detect(waveLength);
        check(expectedResult, realResult, "Violet Test");
    }

    public void lightColorDetectorTwo() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 494;
        String expectedResult = "Blue";
        String realResult = lightColorDetector.detect(waveLength);
        check(expectedResult, realResult, "Blue Test");
    }

    public void lightColorDetectorThree() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 569;
        String expectedResult = "Green";
        String realResult = lightColorDetector.detect(waveLength);
        check(expectedResult, realResult, "Green Test");
    }

    public void lightColorDetectorFour() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 589;
        String expectedResult = "Yellow";
        String realResult = lightColorDetector.detect(waveLength);
        check(expectedResult, realResult, "Yellow Test");
    }

    public void lightColorDetectorFive() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 619;
        String expectedResult = "Orange";
        String realResult = lightColorDetector.detect(waveLength);
        check(expectedResult, realResult, "Orange Test");
    }

    public void lightColorDetectorSix() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 750;
        String expectedResult = "Red";
        String realResult = lightColorDetector.detect(waveLength);
        check(expectedResult, realResult, "Red Test");
    }

    public void check(String expectedResult, String realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
