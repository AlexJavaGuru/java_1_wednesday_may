package lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_27_to_48;

class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (checkTitle(product)) {
            throw new ValidationException("Title validation",
                    "Name cannot be null, cannot be less than 3 and more than 100",
                    "Title");
        }

    }

    private boolean checkTitle(Product product) {
        return product.title == null || product.title.length() < 3 ||
                product.title.length() > 100 ||
                !product.title.matches("^[a-zA-Z0-9]*$");
    }
}
