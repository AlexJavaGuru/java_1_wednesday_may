package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest subject = new LightColorDetectorTest();
        subject.testViolet();
        subject.testBlue();
        subject.testGreen();
        subject.testYellow();
        subject.testOrange();
        subject.testRed();
        subject.testInvisible();
    }


    public void testViolet() {
        LightColorDetector object = new LightColorDetector();
        int wavelength = 400;
        String expectedResult = "Violet";
        String realResult = object.detect(wavelength);
        check(expectedResult, realResult, "Test Violet");
    }

    public void testBlue() {
        LightColorDetector object = new LightColorDetector();
        int wavelength = 470;
        String expectedResult = "Blue";
        String realResult = object.detect(wavelength);
        check(expectedResult, realResult, "Test Blue");
    }

    public void testGreen() {
        LightColorDetector object = new LightColorDetector();
        int wavelength = 520;
        String expectedResult = "Green";
        String realResult = object.detect(wavelength);
        check(expectedResult, realResult, "Test Green");
    }

    public void testYellow() {
        LightColorDetector object = new LightColorDetector();
        int wavelength = 580;
        String expectedResult = "Yellow";
        String realResult = object.detect(wavelength);
        check(expectedResult, realResult, "Test Yellow");
    }

    public void testOrange() {
        LightColorDetector object = new LightColorDetector();
        int wavelength = 600;
        String expectedResult = "Orange";
        String realResult = object.detect(wavelength);
        check(expectedResult, realResult, "Test Orange");
    }

    public void testRed() {
        LightColorDetector object = new LightColorDetector();
        int wavelength = 700;
        String expectedResult = "Red";
        String realResult = object.detect(wavelength);
        check(expectedResult, realResult, "Test Red");
    }

    public void testInvisible() {
        LightColorDetector object = new LightColorDetector();
        int wavelength = 1000;
        String expectedResult = "Invisible";
        String realResult = object.detect(wavelength);
        check(expectedResult, realResult, "Test Invisible");
    }

    public void check(String expectedResult, String realResult, String TestName) {
        if (expectedResult == realResult) {
            System.out.println(TestName + " has passed");
        } else {
            System.out.println(TestName + " has failed");
        }
    }

}
