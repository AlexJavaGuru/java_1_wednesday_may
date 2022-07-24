package main.java.lv.javaguru.student_andrei_de.Homework.lesson4;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest Test1 = new LightColorDetectorTest();
        Test1.LightColorDetectTest();
    }
    private void LightColorDetectTest(){
        LightColorDetector lcdet = new LightColorDetector();
        String result = lcdet.detect(380);
        System.out.println(result);
        result = lcdet.detect(451);
        System.out.println(result);
        result = lcdet.detect(495);
        System.out.println(result);
        result = lcdet.detect(589);
        System.out.println(result);
        result = lcdet.detect(619);
        System.out.println(result);
        result = lcdet.detect(1);
        System.out.println(result);
    }
}
