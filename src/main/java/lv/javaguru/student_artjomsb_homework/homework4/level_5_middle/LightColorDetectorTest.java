package lv.javaguru.student_artjomsb_homework.homework4.level_5_middle;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest tester = new LightColorDetectorTest();
        tester.invisibleColorTest(379);
        tester.violetColorTest(380);
        tester.violetColorTest(449);
        tester.blueColorTest(450);
        tester.blueColorTest(494);
        tester.greenColorTest(495);
        tester.greenColorTest(569);
        tester.yellowColorTest(570);
        tester.yellowColorTest(589);
        tester.orangeColorTest(590);
        tester.orangeColorTest(619);
        tester.redColorTest(620);
        tester.redColorTest(750);
        tester.invisibleColorTest(751);
    }

    void redColorTest(int waveLength) {
        LightColorDetector victim = new LightColorDetector();
        check(victim.detect(waveLength).equals("Red"), "Check Red color");
    }

    void invisibleColorTest(int waveLength) {
        LightColorDetector victim = new LightColorDetector();
        check(victim.detect(waveLength).equals("Invisible Light"), "Check Invisible Light");
    }

    void orangeColorTest(int waveLength) {
        LightColorDetector victim = new LightColorDetector();
        check(victim.detect(waveLength).equals("Orange"), "Check Orange color");
    }

    void yellowColorTest(int waveLength) {
        LightColorDetector victim = new LightColorDetector();
        check(victim.detect(waveLength).equals("Yellow"), "Check Yellow color");
    }

    void greenColorTest(int waveLength) {
        LightColorDetector victim = new LightColorDetector();
        check(victim.detect(waveLength).equals("Green"), "Check Green color");
    }

    void blueColorTest(int waveLength) {
        LightColorDetector victim = new LightColorDetector();
        check(victim.detect(waveLength).equals("Blue"), "Check Blue color");
    }

    void violetColorTest(int waveLength) {
        LightColorDetector victim = new LightColorDetector();
        check(victim.detect(waveLength).equals("Violet"), "Check Violet color");
    }

    void check(boolean isPassed, String testName) {
        if (isPassed) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}
