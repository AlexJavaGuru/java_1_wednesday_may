package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_4_junior;

class FraudDetector {

    boolean isFraud(Transaction t) {
        return isFraudRuleOne(t) || isFraudRuleTwo(t) || isFraudRuleThree(t) || isFraudRuleFour(t) || isFraudRuleFive(t);
    }

    boolean isFraudRuleOne(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

    boolean isFraudRuleTwo(Transaction t) {
        return t.getAmount() > 1000000;
    }

    boolean isFraudRuleThree(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }

    boolean isFraudRuleFour(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }

    boolean isFraudRuleFive(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000;
    }
}
