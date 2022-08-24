package lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer;

import lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_4.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator subject;

    @Before
    public void setUp() throws Exception {
        subject = new Calculator();
    }

    @Test
    public void testSumTwoNumber() {
        int expectedResult = 9;
        int actualResult = subject.sum(5, 4);
        assertEquals("Must be " + expectedResult, expectedResult, actualResult);
    }

    @Test
    public void testSumTwoNumberV2() {
        int expectedResult = 10;
        int actualResult = subject.sum(5, 5);
        assertEquals("Must be " + expectedResult, expectedResult, actualResult);
    }
}