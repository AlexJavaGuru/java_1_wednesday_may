package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_1_intern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorImplTest {
    private TaxCalculator taxCalculator;

    @BeforeEach
    void setUp() {
        taxCalculator = new TaxCalculatorImpl();
    }

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals( new BigDecimal("0.00"),taxToPay);
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals( new BigDecimal("2500.00"),taxToPay);
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("5000.00"),taxToPay);
    }
}