package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_5middle.task_16;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest runner = new LightColorDetectorTest();
        runner.testVioletSpectrum();
        runner.testBlueSpecrum();
        runner.testGreenSpectrum();
        runner.testYellowSpectrum();
        runner.testOrangeSpectrum();
        runner.testRedSpectrum();
        runner.testInvisibleSpectrum();

    }
    public void testVioletSpectrum(){
        LightColorDetector subject = new LightColorDetector();
        int wavwLength = 400;
        String expectedResult = "Violet";
        String actualResult = subject.detect(wavwLength);
        chek(expectedResult,actualResult,"Test Violet");
    }

    public void testBlueSpecrum(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 470;
        String expectedResult = "Blue";
        String actualResult = subject.detect(waveLength);
        chek(expectedResult,actualResult,"Test Blue");
    }

    public void testGreenSpectrum(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 500;
        String expectedResult = "Green";
        String actualResult = subject.detect(waveLength);
        chek(expectedResult,actualResult,"Test Green");
    }

    public void testYellowSpectrum(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 580;
        String expectedResult = "Yellow";
        String actualResult = subject.detect(waveLength);
        chek(expectedResult,actualResult,"Test Yellow");
    }
    public void testOrangeSpectrum(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 600;
        String expectedResult = "Orange";
        String actualResult = subject.detect(waveLength);
        chek(expectedResult,actualResult,"Test Orange");

    }
    public void testRedSpectrum(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 700;
        String expectedResult = "Red";
        String actualResult = subject.detect(waveLength);
        chek(expectedResult,actualResult,"Test Red");

    }
    public void testInvisibleSpectrum(){
        LightColorDetector subject = new LightColorDetector();
        int wavwLength = 900;
        String expectedResult = "Invisible Light";
        String actualResult = subject.detect(wavwLength);
        chek(expectedResult,actualResult,"Test Invisible Light");

    }




    public void chek (String expectedResult, String actualResult, String tastName){
        if( actualResult == expectedResult){
            System.out.println(tastName + " Has passed.OK.");
        }else {
            System.out.println(tastName + " Has FAILED!!!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }

    }



}
