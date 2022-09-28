package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_17_to_33;

import java.util.ArrayList;
import java.util.List;

public class FraudDetectorTest {

    public static void main(String[] args) {
        testIsPokemonFraud();
        testMoreThanMax();
        testIsFromWrongCity();
        testIsTradersFromWrongCountry();
        testIsWrongAmountFromCountry();
    }

    public static void testIsPokemonFraud() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new TraderPokemonRule("Trader is Pokemon"));
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        check(result.getIsFraud(), "Pokemon Test");

    }

    public static void testMoreThanMax() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new AmountIsBiggerThanRule("More then 1000000"));
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("fullName", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        check(result.getIsFraud(), "testMoreThanMax Test");
    }

    public static void testIsFromWrongCity() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new SidneyCityRule("Wrong City"));
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("fullName", "Sidney");
        Transaction transaction = new Transaction(trader, 2);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        check(result.getIsFraud(), "testIsFromWrongCity Test");
    }

    public static void testIsTradersFromWrongCountry() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new CountryFraudRule("Country fraud rule"));
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("fullName", "Random1", "Jamaica");
        Trader traderTwo = new Trader("fullName2", "Random2", "Jamaica");
        Transaction transaction = new Transaction(trader, 2);
        Transaction transactionTwo = new Transaction(traderTwo, 100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        check(result.getIsFraud(), "IsTradersFromWrongCity Test");
    }

    public static void testIsWrongAmountFromCountry() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new WrongCountryAndAmountFraudRule("Germany and amount more than 1000"));
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Vasja", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        check(result.getIsFraud(), "testIsWrongAmountFromCountry Test");
    }

    private static void check(boolean expectedResult, String testName) {
        if (expectedResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + !expectedResult);
        }
    }

}
