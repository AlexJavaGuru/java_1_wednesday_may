package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_5_middle;

public class TraderPokemonRule extends FraudRule {
    TraderPokemonRule(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}
