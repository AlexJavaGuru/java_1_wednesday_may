package main.java.lv.javaguru.teacher.lesson_11_srp.lessoncode;

public class CountryFraudRule extends FraudRule {

    CountryFraudRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }
}
