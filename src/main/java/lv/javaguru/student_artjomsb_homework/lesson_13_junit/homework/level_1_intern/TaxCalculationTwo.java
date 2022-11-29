package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_1_intern;

import java.math.BigDecimal;

public class TaxCalculationTwo implements TaxCalculator {
    private final BigDecimal taxUpTo20000 = new BigDecimal("0.25");
    private final BigDecimal taxAfter20000 = new BigDecimal("0.4");

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal incomeMinus20000 = income.subtract(new BigDecimal(20000));
        BigDecimal taxFrom20000 = new BigDecimal(20000).multiply(taxUpTo20000);
        return incomeMinus20000.multiply(taxAfter20000).add(taxFrom20000);
    }
}
