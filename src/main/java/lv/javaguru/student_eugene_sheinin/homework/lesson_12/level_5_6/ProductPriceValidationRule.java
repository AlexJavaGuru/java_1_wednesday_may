package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_5_6;

public class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        } else if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price should be more than 0", "price");
        }
    }
}
