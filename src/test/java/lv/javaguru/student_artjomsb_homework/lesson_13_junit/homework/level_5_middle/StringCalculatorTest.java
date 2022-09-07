package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_5_middle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    void testEmpty() {
        String input = "  ";
        int actualResult = calculator.add(input);
        assertEquals(0, actualResult);
    }

    @Test
    void testEmptyWithoutSpacing() {
        String input = "";
        int actualResult = calculator.add(input);
        assertEquals(0, actualResult);
    }
    @Test
    void testAddNumbers() {
        String input = "10       ,           2, 4 ";
        int actualResult = calculator.add(input);
        assertEquals(16, actualResult);
    }
    @Test
    void testOnlyComa() {
        String input = ", ,    ,";
        int actualResult = calculator.add(input);
        assertEquals(0, actualResult);
    }
    @Test
    void testOneNumber() {
        String input = " , 10,    ";
        int actualResult = calculator.add(input);
        assertEquals(10, actualResult);
    }

    @Test
    void testNumberWithAnyNonDigit() {
        String input = "1\n2fs3,4";
        int actualResult = calculator.add(input);
        assertEquals(10, actualResult);
    }
}