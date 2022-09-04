package lv.javaguru.student_vladislav_kulikov.lesson_13.task_1_to_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {

    TaxCalculatorImpl taxCalculator;

    @BeforeEach
    void setUp() {
        this.taxCalculator = new TaxCalculatorImpl();
    }

    @Test
    public void testCalculateTax() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncome5000() {
        var income = new BigDecimal(5000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("1250.00"));
    }

    @Test
    public void shouldPay25PercentAnd40PercentTaxWhenIncome50000() {
        var income = new BigDecimal(30000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("9000.00"));
    }
}