package lv.javaguru.student_artjomsb_homework.lesson_15_refactoring.homework.level_2_intern;

import lv.javaguru.teacher.lesson_11_srp.lessoncode.Trader;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return isNamePokemon(trader) || isCitySydney(trader);

    }

    boolean isNamePokemon(Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    boolean isCitySydney(Trader trader) {
        return trader.getCity().equals("Sidney");
    }

}
