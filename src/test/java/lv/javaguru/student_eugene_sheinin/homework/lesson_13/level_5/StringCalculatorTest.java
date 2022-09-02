package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_5;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator subject;

    @BeforeEach
    void setUp() {
        subject = new StringCalculator();
    }

    @Test
    void testSumV1() {
        assertEquals(11, subject.add("5,6"));
    }

    @Test
    void testSumV2() {
        assertEquals(0, subject.add(""));
    }

    @Test
    void testSumV3() {
        assertEquals(7, subject.add("7"));
    }

    @Test
    void testSumV4() {
        assertEquals(16, subject.add("7,4,5"));
    }

    @Test
    void testSumV5() {
        assertEquals(3, subject.add("//[;]\n1;2"));
    }

    @Test
    void testSumV6() {
        assertEquals(6, subject.add("//[;][&]\n1;2&3"));
    }
}