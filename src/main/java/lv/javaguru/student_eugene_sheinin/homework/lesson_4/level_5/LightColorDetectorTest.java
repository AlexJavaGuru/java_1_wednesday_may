package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_5;



class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest();
    }

    public void detectTest() {

        LightColorDetector lightColorDetector = new LightColorDetector();

        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(381);
        this.check(expectedResult, actualResult,"test Violet detect method ");
        expectedResult = "Blue";
        actualResult = lightColorDetector.detect(451);
        this.check(expectedResult, actualResult,"test Blue detect method");
        expectedResult = "Green";
        actualResult = lightColorDetector.detect(568);
        this.check(expectedResult, actualResult,"test Green detect method");
        expectedResult = "Yellow";
        actualResult = lightColorDetector.detect(589);
        this.check(expectedResult, actualResult,"test Yellow detect method");
        expectedResult = "Orange";
        actualResult = lightColorDetector.detect(591);
        this.check(expectedResult, actualResult,"test Orange detect method");
        expectedResult = "Red";
        actualResult = lightColorDetector.detect(620);
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
