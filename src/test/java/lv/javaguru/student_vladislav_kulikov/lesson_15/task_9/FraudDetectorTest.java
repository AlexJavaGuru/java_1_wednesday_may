package lv.javaguru.student_vladislav_kulikov.lesson_15.task_9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector detector;

    @BeforeEach
    void setUp() {
        detector = new FraudDetector();
    }

    @Test
    void testIsFraud() {
        Trader trader = new Trader("Pokemon", "Sidney");
        assertThat(detector.isFraud(trader)).isEqualTo(true);
    }

    @Test
    void compareTraderName() {
        Trader trader = new Trader("Pokemon", "Sidney");
    }

    @Test
    void compareCity() {
    }
}