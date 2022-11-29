package lv.javaguru.student_rodions_pismennijs.lesson_11.level_4;

public class GermanyThousandRule extends FraudRule {

    public GermanyThousandRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") &&
                t.getAmount() > 1000;
    }

}
