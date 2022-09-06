package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

public class ValidationRuleTitleOne implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        String title = product.getName();
        String ruleName = "First RULE";
        String description = "Can't be empty";
        String fieldName = "title";
        if (title == null) {
            throw new ValidationException(ruleName, description, fieldName);
        } else if (title.trim().equals("")) {
            throw new ValidationException(ruleName, description, fieldName);
        }

    }
}
