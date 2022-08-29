package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_5_6;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator{

    private ProductTitleValidationRule titleValidationRule;
    private ProductPriceValidationRule priceValidationRule;
    private ProductDescriptionValidationRule descriptionValidationRule;
    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                               ProductPriceValidationRule priceValidationRule,
                               ProductDescriptionValidationRule  descriptionValidationRule
    ) {
        this.titleValidationRule = titleValidationRule;
        this.priceValidationRule = priceValidationRule;
        this.descriptionValidationRule = descriptionValidationRule;
    }

    @Override
    public List<ValidationException> validate(Product product) {

        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }

        try {
            priceValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }

        try {
            descriptionValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }


        return exceptions;
    }

}
