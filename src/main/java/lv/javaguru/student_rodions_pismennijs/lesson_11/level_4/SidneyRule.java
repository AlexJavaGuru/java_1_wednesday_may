package lv.javaguru.student_rodions_pismennijs.lesson_11.level_4;

public class SidneyRule extends FraudRule {

    public SidneyRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }

}
