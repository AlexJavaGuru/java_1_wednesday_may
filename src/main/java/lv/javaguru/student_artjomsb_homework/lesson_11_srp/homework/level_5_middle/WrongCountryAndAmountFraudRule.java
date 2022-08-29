package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_5_middle;

public class WrongCountryAndAmountFraudRule extends FraudRule {

    WrongCountryAndAmountFraudRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") &&
                t.getAmount() > 1000;
    }
}
