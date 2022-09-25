package lv.javaguru.student_vladislav_kulikov.lesson_15.task_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class QuadraticEqTest {

    QuadraticEq quadraticEq;

    @BeforeEach
    void add() {
        quadraticEq = new QuadraticEq();
    }

    @Test
    void testDiscriminantMoreThanZero() {
        assertThat(quadraticEq.calc(1, 3, 0)).isEqualTo("x1 = " + -3.0 + ", x2 = " + 0.0);
    }

    @Test
    void testDiscriminantEqualsZero() {
        assertThat(quadraticEq.calc(0, 0, 0)).isEqualTo("x = NaN" );
    }

    @Test
    void testDiscriminantLessThanZero() {
        assertThat(quadraticEq.calc(10, 10, 10)).isEqualTo("Equation has no roots");
    }


}