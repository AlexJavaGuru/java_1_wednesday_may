package lv.javaguru.student_vladislav_kulikov.lesson_15.task_9;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return compareTraderName(trader) ||
                (compareCity(trader));
    }

    private boolean compareTraderName (Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    private boolean compareCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }
}
