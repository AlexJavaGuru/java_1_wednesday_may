package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

import java.util.regex.Pattern;

public class ValidationRuleDescriptionTwo implements FieldValidationRule {
    public void validate(Product product) throws ValidationException {
        String ruleName = "Description RULE two";
        String description = "Contain English letters and digits";
        String fieldName = "description";
        Pattern regexRule = Pattern.compile("[^a-zA-Z\\d]");
        if (regexRule.matcher(product.getDescription()).find()) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
