package lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest runner = new LightColorDetectorTest();
        runner.violetStartRangeTest();
        runner.violetEndRangeTest();
        runner.blueStartRangeTest();
        runner.blueEndRangeTest();
        runner.greenStartRangeTest();
        runner.greenEndRangeTest();
        runner.yellowStartRangeTest();
        runner.yellowEndRangeTest();
        runner.orangeStartRangeTest();
        runner.orangeEndRangeTest();
        runner.redStartRangeTest();
        runner.redEndRangeTest();
        runner.invisibleColorRangeTest();
        runner.invisibleColorRangeTestB();
    }

    public void violetStartRangeTest() {
        int waveLength = 380;
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Violet Test Start");
    }

    public void violetEndRangeTest() {
        int waveLength = 449;
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Violet Test End");
    }

    public void blueStartRangeTest() {
        int waveLength = 450;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Blue Test Start");
    }

    public void blueEndRangeTest() {
        int waveLength = 494;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Blue Test End");
    }

    public void greenStartRangeTest() {
        int waveLength = 495;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Green Test Start");
    }

    public void greenEndRangeTest() {
        int waveLength = 569;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Green Test End");
    }

    public void yellowStartRangeTest() {
        int waveLength = 570;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Yellow Test Start");
    }

    public void yellowEndRangeTest() {
        int waveLength = 589;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Yellow Test End");
    }

    public void orangeStartRangeTest() {
        int waveLength = 590;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Orange Test Start");
    }

    public void orangeEndRangeTest() {
        int waveLength = 619;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Orange Test End");
    }

    public void redStartRangeTest() {
        int waveLength = 620;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Red Test Start");
    }

    public void redEndRangeTest() {
        int waveLength = 750;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Red Test End");
    }

    public void invisibleColorRangeTest() {
        int waveLength = 379;
        String expectedResult = "Invisible";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Invisible Test A");
    }

    public void invisibleColorRangeTestB() {
        int waveLength = 751;
        String expectedResult = "Invisible";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        check(expectedResult, realResult, "Invisible Test B");
    }

    public void check(String expectedResult, String actualResult, String testName) { //ничего, если я скопировал этот метод? :D
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
