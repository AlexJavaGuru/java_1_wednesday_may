package lv.javaguru.student_rodions_pismennijs.lesson_11.level_4;

public class PokemonRule extends FraudRule {

    public PokemonRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}
