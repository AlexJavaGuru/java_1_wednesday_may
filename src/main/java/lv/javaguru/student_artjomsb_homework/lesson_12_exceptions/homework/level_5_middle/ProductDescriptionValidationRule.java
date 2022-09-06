package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

import java.util.ArrayList;
import java.util.List;

class ProductDescriptionValidationRule implements FieldValidationRule {
    List<FieldValidationRule> rules = new ArrayList<>();

    @Override
    public void validate(Product product) throws ValidationException {
        ValidationRuleDescriptionOne ruleDescriptionOne = new ValidationRuleDescriptionOne();
        ValidationRuleDescriptionTwo ruleDescriptionTwo = new ValidationRuleDescriptionTwo();
        rules.add(ruleDescriptionOne);
        rules.add(ruleDescriptionTwo);
        for (FieldValidationRule rule : rules) {
            rule.validate(product);
        }
    }
}