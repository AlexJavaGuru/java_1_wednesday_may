package main.java.lv.javaguru.teacher.lesson_11_srp.lessoncode;

public class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName){
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean getIsFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

}