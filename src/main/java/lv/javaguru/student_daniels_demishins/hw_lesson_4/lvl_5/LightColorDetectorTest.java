package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector subject = new LightColorDetector();
        subject.testViolet();
        subject.testBlue();
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

    public void check(String expectedResult, String realResult, String TestName) {
        if (expectedResult == realResult) {
            System.out.println(TestName + "has passed");
        } else {
            System.out.println(TestName + "has failed");
        }
    }

}
