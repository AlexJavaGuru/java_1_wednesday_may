package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

import java.util.ArrayList;
import java.util.List;

class ProductPriceValidationRule implements FieldValidationRule {
    List<FieldValidationRule> rules = new ArrayList<>();

    @Override
    public void validate(Product product) throws ValidationException {
        ValidationRulePrice validationRule = new ValidationRulePrice();
        rules.add(validationRule);
        for (FieldValidationRule rule : rules) {
            rule.validate(product);
        }
    }
}