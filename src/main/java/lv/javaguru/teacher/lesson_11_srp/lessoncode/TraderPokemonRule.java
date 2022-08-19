package main.java.lv.javaguru.teacher.lesson_11_srp.lessoncode;

public class TraderPokemonRule extends FraudRule{

    TraderPokemonRule (String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}
