package lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_27_to_48;

import java.util.ArrayList;
import java.util.List;

class ProductValidationImpl implements ProductValidation {

    private List<FieldValidationRule> validationRules = new ArrayList<>();

    ProductValidationImpl(ProductTitleValidationRule titleValidationRule,
                          ProductPriceValidationRule priceValidationRule,
                          ProductDescriptionValidationRule descriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (FieldValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}
