package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_5_middle;

public class AmountIsBiggerThanRule extends FraudRule {
    public AmountIsBiggerThanRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
