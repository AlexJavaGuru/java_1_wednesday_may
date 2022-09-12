package lv.javaguru.student_rodions_pismennijs.lesson_11.level_4;

public class MillionRule extends FraudRule {

    public MillionRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }

}
