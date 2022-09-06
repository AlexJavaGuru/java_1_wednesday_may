package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

public class ValidationRuleDescriptionOne implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        String ruleName = "Description RULE one";
        String description = "Description can't be longer than 2000 characters";
        String fieldName = "description";
        if (product.getDescription().length() > 2000) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
