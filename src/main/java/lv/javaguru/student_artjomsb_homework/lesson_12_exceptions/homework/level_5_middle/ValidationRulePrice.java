package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

public class ValidationRulePrice implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        double price = product.getPrice();
        String ruleName = "Price RULE";
        String description = "Price can't be 0 or smaller";
        String fieldName = "price";
        if (price <= 0) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
