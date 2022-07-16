package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_5;



class LightColorDetectorTest {
    LightColorDetector lightColorDetector;


    //with task 25 refactoring
    LightColorDetectorTest() {
        lightColorDetector = new LightColorDetector();
    }

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectVioletTest(381);
        lightColorDetectorTest.detectBlueTest(451);
        lightColorDetectorTest.detectGreenTest(568);
        lightColorDetectorTest.detectYellowTest(589);
        lightColorDetectorTest.detectOrangeTest(591);
        lightColorDetectorTest.detectRedTest(620);
    }

    void detectVioletTest(int wavelength) {
        String expectedResult = "Violet";
        String actualResult = this.lightColorDetector.detect(wavelength);
        this.check(expectedResult, actualResult,"test Violet detect method ");
    }

    void detectBlueTest(int wavelength) {
        String expectedResult = "Blue";
        String actualResult = this.lightColorDetector.detect(wavelength);
        this.check(expectedResult, actualResult,"test Blue detect method");
    }

    void detectGreenTest(int wavelength) {
        String expectedResult = "Green";
        String actualResult = this.lightColorDetector.detect(wavelength);
        this.check(expectedResult, actualResult,"test Green detect method");
    }

    void detectYellowTest(int wavelength) {
        String expectedResult = "Yellow";
        String actualResult = this.lightColorDetector.detect(wavelength);
        this.check(expectedResult, actualResult,"test Yellow detect method");
    }

    void detectOrangeTest(int wavelength) {
        String expectedResult = "Orange";
        String actualResult = this.lightColorDetector.detect(wavelength);
        this.check(expectedResult, actualResult,"test Orange detect method");
    }

    void detectRedTest(int wavelength) {
        String expectedResult = "Red";
        String actualResult = this.lightColorDetector.detect(wavelength);
        this.check(expectedResult, actualResult,"test Red detect method");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
