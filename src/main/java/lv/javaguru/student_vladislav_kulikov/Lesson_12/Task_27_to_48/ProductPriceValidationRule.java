package lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_27_to_48;

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (checkPrice(product)) {
            throw new ValidationException("Price validation",
                    "Price must not be empty, must contain only digits, cannot be 0",
                    "Price");
        }
    }
    private boolean checkPrice(Product product) {
        return product.price == null || product.price == 0 || !product.price.toString().matches("[0-9]+") ;
    }
}
