package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_1_intern;

import java.math.BigDecimal;

public class TaxCalculationOne implements TaxCalculator {
    private final BigDecimal taxUpTo20000 = new BigDecimal("0.25");

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        return income.multiply(taxUpTo20000);
    }
}
