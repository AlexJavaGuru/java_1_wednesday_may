package main.java.lv.javaguru.teacher.lesson_11_srp.lessoncode;

public class SidneyCityRule extends FraudRule{

    SidneyCityRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getTrader().getCity().equals("Sidney");
    }
}
