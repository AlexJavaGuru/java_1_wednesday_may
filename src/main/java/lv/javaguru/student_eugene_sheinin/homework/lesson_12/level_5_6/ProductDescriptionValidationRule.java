package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_5_6;

public class ProductDescriptionValidationRule implements FieldValidationRule{

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "Description can not be more than 2000 symbol", "description");
        } else if (!product.getDescription().matches("[a-zA-Z\\d]+")) {
            throw new ValidationException("RULE-8", "Description contain only [a-zA-Z] symbols", "description");
        }
    }
}
