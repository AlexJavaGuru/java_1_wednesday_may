package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

public class ValidationRuleTitleThree implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        String title = product.getName().trim();
        String ruleName = "Third RULE";
        String description = "Can't be longer than 100 characters";
        String fieldName = "title";
        if (title.length() > 100) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
