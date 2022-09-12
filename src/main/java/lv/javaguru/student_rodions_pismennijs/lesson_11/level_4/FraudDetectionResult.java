package lv.javaguru.student_rodions_pismennijs.lesson_11.level_4;

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
