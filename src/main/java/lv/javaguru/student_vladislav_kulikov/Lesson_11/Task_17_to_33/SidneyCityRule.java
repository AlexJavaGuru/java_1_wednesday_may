package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_17_to_33;

public class SidneyCityRule extends FraudRule {

    SidneyCityRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getTrader().getCity().equals("Sidney");
    }
}
