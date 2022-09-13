package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_5_middle;

public class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
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

