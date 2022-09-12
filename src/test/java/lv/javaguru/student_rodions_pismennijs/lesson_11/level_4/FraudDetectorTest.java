package lv.javaguru.student_rodions_pismennijs.lesson_11.level_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    List<FraudRule> fraudRules;
    FraudDetector subject;

    @BeforeEach
    void setUp() {
        fraudRules = new ArrayList<>();
        subject = new FraudDetector(fraudRules);
    }

    @Test
    void testNotFraud() {
        Trader trader = new Trader("some name", "some city", "some country");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetectionResult fraud = subject.isFraud(transaction);
        assertFalse(fraud.getIsFraud(), "Not fraud test");
    }

    @Test
    void testPokemonRule() {
        fraudRules.add(new PokemonRule("Trader is Pokemon"));
        Trader trader = new Trader("Pokemon", "some city");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult fraud = subject.isFraud(transaction);
        assertTrue(fraud.getIsFraud(), "Pokemon test");
    }

    @Test
    void testMillionRule() {
        fraudRules.add(new MillionRule("Amount > 1000000"));
        Trader trader = new Trader("some person", "some city");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult fraud = subject.isFraud(transaction);
        assertTrue(fraud.getIsFraud(), "Million test");
    }

    @Test
    void testSidneyRule() {
        fraudRules.add(new SidneyRule("Sidney city"));
        Trader trader = new Trader("some person", "Sidney");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult fraud = subject.isFraud(transaction);
        assertTrue(fraud.getIsFraud(), "Sidney test");
    }

    @Test
    void testJamaicaRule() {
        fraudRules.add(new JamaicaRule("Jamaica country"));
        Trader trader = new Trader("some person", "some city", "Jamaica");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult fraud = subject.isFraud(transaction);
        assertTrue(fraud.getIsFraud(), "Jamaica test");
    }

    @Test
    void testGermanyThousandRule() {
        fraudRules.add(new GermanyThousandRule("Germany & > 1000"));
        Trader trader = new Trader("some person", "some city", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult fraud = subject.isFraud(transaction);
        assertTrue(fraud.getIsFraud(), "Germany thousand test");
    }
}