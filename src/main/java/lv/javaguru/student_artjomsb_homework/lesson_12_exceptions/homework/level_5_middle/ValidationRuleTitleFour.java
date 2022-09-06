package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

import java.util.regex.Pattern;

public class ValidationRuleTitleFour implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        String title = product.getName().trim();
        String ruleName = "Fourth RULE";
        String description = "Only contain English letters and digits";
        String fieldName = "title";
        Pattern regexRule = Pattern.compile("[^a-zA-Z\\d ]");
        if (regexRule.matcher(title).find()) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
