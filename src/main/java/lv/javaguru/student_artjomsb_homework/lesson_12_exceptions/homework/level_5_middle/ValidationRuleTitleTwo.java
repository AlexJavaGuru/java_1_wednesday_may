package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

public class ValidationRuleTitleTwo implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        String title = product.getName().trim();
        String ruleName = "Second RULE";
        String description = "Can't be shorter than 3 characters";
        String fieldName = "title";
        if (title.length() < 3) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
