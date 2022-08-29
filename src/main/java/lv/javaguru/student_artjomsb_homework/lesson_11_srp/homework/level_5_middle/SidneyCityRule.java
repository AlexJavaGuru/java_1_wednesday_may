package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_5_middle;

class SidneyCityRule extends FraudRule {

    SidneyCityRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }
}
