package lv.javaguru.student_vladislav_kulikov.lesson_13.task_26_to_32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {


    @Test
    void testEmptyString() {
        assertEquals(0, (StringCalculator.add(" ")));
        assertEquals(0, (StringCalculator.add("")));
    }

    @Test
    void testOneNumber() {
        assertEquals(1, (StringCalculator.add("1")));
    }

    @Test
    void testNormalString2Numbers() {
        assertEquals(3, (StringCalculator.add("1,2")));
    }

    @Test
    void testNormalStringMore2Numbers() {
        assertEquals(45, (StringCalculator.add("1,2,3,4,5,6,7,8,9")));
    }

    @Test
    void testNormalStringSymbols() {
        assertEquals(7, (StringCalculator.add("1\n1\n2\n3\n")));
    }

    @Test
    void testNormalStringMore() {
        assertEquals(7, (StringCalculator.add("\n //1;1[],//;][5")));
    }
}