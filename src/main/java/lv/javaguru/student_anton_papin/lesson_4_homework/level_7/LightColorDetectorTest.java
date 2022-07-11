package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_7;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }

    private LightColorDetector lightColorDetector = new LightColorDetector();

    public void testViolet(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Violet"), "Test color - Violet is ");

    }

    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Blue"), "Test color - Blue is ");
    }

    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Green"), "Test color - Green is ");
    }

    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Yellow"), "Test color - Yellow is ");
    }

    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Orange"), "Test color - Orange is ");
    }

    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Red"), "Test color - Red is ");
    }

    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Invisible Light"), "Test color - Invisible Light is ");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}

