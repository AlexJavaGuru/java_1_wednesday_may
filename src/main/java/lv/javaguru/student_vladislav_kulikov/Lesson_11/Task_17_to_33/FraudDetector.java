package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_17_to_33;

import java.util.List;

public class FraudDetector {

    List<FraudRule> fraudRule;

    FraudDetector(List<FraudRule> fraudRule) {
        this.fraudRule = fraudRule;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule rule : fraudRule) {
            if (rule.isFraud(t)) {
                System.out.println("Rule Name: " + rule.getRuleName());
                System.out.println("Transaction: " + t);
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

}
