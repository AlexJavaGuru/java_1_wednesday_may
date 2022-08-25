package lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_27_to_48;

class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (checkDescription(product)) {
            throw new ValidationException("Description validation",
                    "Must not be longer than 2000 characters," +
                            " must contain only English letters and numbers, other characters are not allowed",
                    "Description");
        }

    }

    private boolean checkDescription(Product product) {
        return product.description.length() > 2000 || !product.description.matches("^[a-zA-Z0-9]*$");
    }

}
