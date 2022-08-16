package main.java.lv.javaguru.teacher.lesson_11_srp.lessoncode;

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
