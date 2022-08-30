package lv.javaguru.teacher.lesson_11_srp.lessoncode;

public class WrongCountryAndAmountFraudRule extends FraudRule{

    WrongCountryAndAmountFraudRule (String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getTrader().getCountry().equals("Germany") &&
                t.getAmount() > 1000;
    }
}
