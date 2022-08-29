package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_5_middle;

public class CountryFraudRule extends FraudRule {
    CountryFraudRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }
}
