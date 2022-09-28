package lv.javaguru.teacher.lesson_11_srp.lessoncode;

public class AmountIsBiggerThanRule extends FraudRule{

    public AmountIsBiggerThanRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t){

        return t.getAmount() > 1000000;
    }


}
