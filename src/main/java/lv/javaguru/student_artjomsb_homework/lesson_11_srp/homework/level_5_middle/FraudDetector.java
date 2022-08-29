package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_5_middle;

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
