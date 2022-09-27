package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorDetectorViolet();
        LightColorDetectorTest.lightColorDetectorBlue();
        lightColorDetectorTest.lightColorDetectorGreen();
        lightColorDetectorTest.lightColorDetectorYellow();
        lightColorDetectorTest.lightColorDetectorOrange();
        lightColorDetectorTest.lightColorDetectorRed();
        lightColorDetectorTest.lightColorDetectorInvisible();
    }

    public void lightColorDetectorViolet() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 380;
        String expectedResult = "Violet";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Violet test has passed");
        } else {
            System.out.println("Violet test has failed");
        }
    }

    public static void lightColorDetectorBlue() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 494;
        String expectedResult = "Blue";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Blue test has passed");
        } else {
            System.out.println("Blue test has failed");
        }
    }

    public void lightColorDetectorGreen() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 569;
        String expectedResult = "Green";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Green test has passed");
        } else {
            System.out.println("Green test has failed");
        }
    }

    public void lightColorDetectorYellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 570;
        String expectedResult = "Yellow";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Yellow test has passed");
        } else {
            System.out.println("Yellow test has failed");
        }
    }

    public void lightColorDetectorOrange() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 619;
        String expectedResult = "Orange";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Orange test has passed");
        } else {
            System.out.println("Orange test has failed");
        }
    }

    public void lightColorDetectorRed() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 750;
        String expectedResult = "Red";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Red test has passed");
        } else {
            System.out.println("Red test has failed");
        }
    }

    public void lightColorDetectorInvisible() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 379;
        String expectedResult = "Invisible Light";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Invisible Light test has passed");
        } else {
            System.out.println("Invisible Light test has failed");
        }
    }
}

