package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_5_6;

public class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().isBlank()) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        } else if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be less 3 symbol", "title");
        } else if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be more than 100 symbol", "title");
        } else if (!product.getTitle().matches("[a-zA-Z\\d]+")) {
            throw new ValidationException("RULE-4", "Title contain only [a-zA-Z\\d] symbols", "title");

        }
    }
}
