package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest runner = new LightColorDetectorTest();
        runner.violetTest();
        runner.blueTest();
        runner.greenTest();
        runner.yellowTest();
        runner.orangeTest();
        runner.redTest();
        runner.invisibleTest();


    }

    public void violetTest() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 400;
        String expectedResult = "Violet";
        String actualResult = subject.detect(waveLength);
        if (expectedResult == actualResult) {
            System.out.println("Test1 has passed");
        } else {
            System.out.println("Test1 has failed ");

        }

    }

    public void blueTest() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 470;
        String expectedResult = "Blue";
        String actualResult = subject.detect(waveLength);
        if (expectedResult == actualResult) {
            System.out.println("Test2 has passed");
        } else {
            System.out.println("Test2 has failed ");
        }
    }

    public void greenTest() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 540;
        String expectedResult = "Green";
        String actualResult = subject.detect(waveLength);
        if (expectedResult == actualResult) {
            System.out.println("Test3 has passed");
        } else {
            System.out.println("Test3 has failed ");
        }
    }

    public void yellowTest() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 580;
        String expectedResult = "Yellow";
        String actualResult = subject.detect(waveLength);
        if (expectedResult == actualResult) {
            System.out.println("Test4 has passed");
        } else {
            System.out.println("Test4 has failed ");
        }
    }

    public void orangeTest() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 617;
        String expectedResult = "Orange";
        String actualResult = subject.detect(waveLength);
        if (expectedResult == actualResult) {
            System.out.println("Test5 has passed");
        } else {
            System.out.println("Test5 has failed ");
        }
    }

    public void redTest() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 700;
        String expectedResult = "Red";
        String actualResult = subject.detect(waveLength);
        if (expectedResult == actualResult) {
            System.out.println("Test6 has passed");
        } else {
            System.out.println("Test6 has failed ");
        }
    }

    public void invisibleTest() {
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 760;
        String expectedResult = "Invisible";
        String actualResult = subject.detect(waveLength);
        if (expectedResult == actualResult) {
            System.out.println("Test7 has passed");
        } else {
            System.out.println("Test7 has failed ");
        }
    }
}