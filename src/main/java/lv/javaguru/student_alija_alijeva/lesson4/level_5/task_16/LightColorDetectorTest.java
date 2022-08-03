package main.java.lv.javaguru.student_alija_alijeva.lesson4.level_5.task_16;


class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violet();
        lightColorDetectorTest.blue();
        lightColorDetectorTest.green();
        lightColorDetectorTest.yellow();
        lightColorDetectorTest.orange();
        lightColorDetectorTest.red();
        lightColorDetectorTest.invisible();
    }

    public void violet() {
        int wavelength = 381;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Color test = OK");
        } else {
            System.out.println("Color test = FAIL");
        }
    }

    public void blue() {
        int wavelength = 453;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Color test = OK");
        } else {
            System.out.println("Color test = FAIL");
        }
    }

    public void green() {
        int wavelength = 495;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Color test = OK");
        } else {
            System.out.println("Color test = FAIL");
        }
    }

    public void yellow() {
        int wavelength = 576;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Color test = OK");
        } else {
            System.out.println("Color test = FAIL");
        }
    }

    public void orange() {
        int wavelength = 596;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Color test = OK");
        } else {
            System.out.println("Color test = FAIL");
        }
    }

    public void red() {
        int wavelength = 730;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Color test = OK");
        } else {
            System.out.println("Color test = FAIL");
        }
    }

    public void invisible() {
        int wavelength = 770;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Color test = OK");
        } else {
            System.out.println("Color test = FAIL");
        }
    }
}
