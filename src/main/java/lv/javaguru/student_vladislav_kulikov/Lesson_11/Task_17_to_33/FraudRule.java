package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_17_to_33;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }
}
