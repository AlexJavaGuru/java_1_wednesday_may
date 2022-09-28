package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_17_to_33;

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
