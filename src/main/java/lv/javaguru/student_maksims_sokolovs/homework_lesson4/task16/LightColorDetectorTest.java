package lv.javaguru.student_maksims_sokolovs.homework_lesson4.task16;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.violet();
        lightColorDetector.blue();
        lightColorDetector.green();
        lightColorDetector.yellow();
        lightColorDetector.orange();
        lightColorDetector.red();
    }

    public void violet() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 449;
        String expectedResult = "Violet";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    public void blue() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 494;
        String expectedResult = "Blue";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    public void green() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 569;
        String expectedResult = "Green";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    public void yellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 589;
        String expectedResult = "Yellow";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public void orange() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 619;
        String expectedResult = "Orange";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    public void red() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 750;
        String expectedResult = "Red";
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

}