package main.java.lv.javaguru.student_rodions_pismennijs.lesson_4.level_7;

class LightColorDetectorTest {
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
        check(result.equals("Violet"), "Violet");

    }

    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Blue"), "Blue");
    }

    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Green"), "Green");
    }

    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Yellow"), "Yellow");
    }

    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Orange"), "Orange");
    }

    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Red"), "Red");
    }

    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Invisible Light"), "Invisible Light");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
