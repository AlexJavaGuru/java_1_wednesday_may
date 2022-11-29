package lv.javaguru.student_rodions_pismennijs.lesson_11.level_4;

public class JamaicaRule extends FraudRule {

    public JamaicaRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }

}
