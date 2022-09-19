package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_17_to_33;

public class WrongCountryAndAmountFraudRule extends FraudRule {

    WrongCountryAndAmountFraudRule (String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getTrader().getCountry().equals("Germany") &&
                t.getAmount() > 1000;
    }
}
