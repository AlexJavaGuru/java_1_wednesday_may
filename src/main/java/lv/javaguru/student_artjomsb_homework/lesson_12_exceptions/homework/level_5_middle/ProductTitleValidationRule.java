package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

import java.util.ArrayList;
import java.util.List;

class ProductTitleValidationRule implements FieldValidationRule {
    List<FieldValidationRule> rules = new ArrayList<>();

    public void validate(Product product) throws ValidationException {
        ValidationRuleTitleOne ruleTitleOne = new ValidationRuleTitleOne();
        ValidationRuleTitleTwo ruleTitleTwo = new ValidationRuleTitleTwo();
        ValidationRuleTitleThree ruleTitleThree = new ValidationRuleTitleThree();
        ValidationRuleTitleFour ruleTitleFour = new ValidationRuleTitleFour();
        rules.add(ruleTitleOne);
        rules.add(ruleTitleTwo);
        rules.add(ruleTitleThree);
        rules.add(ruleTitleFour);
        for (FieldValidationRule rule : rules) {
            rule.validate(product);
        }
    }

}

