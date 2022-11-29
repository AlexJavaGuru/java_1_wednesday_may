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
        String input = "1\n2,fs3,gdf4";
        int actualResult = calculator.add(input);
        assertEquals(10, actualResult);
    }

    @Test
    void testNumberWithAnyNonDigitV2() {
        String input = "1fd,\nfd2,fsjhfgh,3f,d,gdf4";
        int actualResult = calculator.add(input);
        assertEquals(10, actualResult);
    }

    @Test
    void testNewLineInTheEnd() {
        String input = "1fd,\nfd2,fsjhfgh,3f,d,gdf4\n";
        int actualResult = calculator.add(input);
        assertEquals(0, actualResult);
    }
    @Test
    void testTwoDelimiter() {
        String input = "//[;][&]\n1;2&3";
        int actualResult = calculator.add(input);
        assertEquals(6, actualResult);
    }
    @Test
    void testFourDelimiters() {
        String input = "//[;][&][:][k]\n1;2&3:5k6";
        int actualResult = calculator.add(input);
        assertEquals(17, actualResult);
    }
}