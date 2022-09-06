package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_1_intern;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.intValue() <= 20000) {
            return new TaxCalculationOne().calculateTax(income);
        } else {
            return new TaxCalculationTwo().calculateTax(income);
        }
    }
}
