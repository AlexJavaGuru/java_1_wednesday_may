package lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_27_to_48;


import java.util.List;

class ProductValidatorImplTest {

    public static void main(String[] args) {
        ruleOneV1();
        ruleOneV2();
        ruleTwo();
        ruleThree();
        ruleFour();
        ruleFive();
        ruleSix();
        ruleSeven();
        ruleEight();
    }

    static ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    static ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    static ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();

    static void ruleOneV1() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule, priceValidationRule,
                descriptionValidationRule);
        Product product = new Product(null, 1, "Example");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.get(0).getRuleName().equals("Title validation"), "Rule 1");
        check(exceptions.get(0).getDescription().equals("Name cannot be null," +
                " cannot be less than 3 and more than 100"), "Rule 1");
        check(exceptions.get(0).getFieldName().equals("Title"), "Rule 1");

    }

    static void ruleOneV2() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule, priceValidationRule,
                descriptionValidationRule);
        Product product = new Product(" ", 1, "Example");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.get(0).getRuleName().equals("Title validation"), "Rule 1 V2");
        check(exceptions.get(0).getDescription().equals("Name cannot be null," +
                " cannot be less than 3 and more than 100"), "Rule 1 V2");
        check(exceptions.get(0).getFieldName().equals("Title"), "Rule 1 V2");
    }

    static void ruleTwo() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule, priceValidationRule,
                descriptionValidationRule);
        Product product = new Product("Ap", 1, "Example");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.get(0).getRuleName().equals("Title validation"), "Rule 2");
        check(exceptions.get(0).getDescription().equals("Name cannot be null," +
                " cannot be less than 3 and more than 100"), "Rule 2");
        check(exceptions.get(0).getFieldName().equals("Title"), "Rule 2");
    }

    static void ruleThree() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule, priceValidationRule,
                descriptionValidationRule);
        StringBuilder title = new StringBuilder();
        title.append("A".repeat(101));
        Product product = new Product(title.toString(), 1, "Example");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.get(0).getRuleName().equals("Title validation"), "Rule 3");
        check(exceptions.get(0).getDescription().equals("Name cannot be null," +
                " cannot be less than 3 and more than 100"), "Rule 3");
        check(exceptions.get(0).getFieldName().equals("Title"), "Rule 3");
    }

    static void ruleFour() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule, priceValidationRule,
                descriptionValidationRule);
        Product product = new Product("$%^", 1, "Example");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.get(0).getRuleName().equals("Title validation"), "Rule 4");
        check(exceptions.get(0).getDescription().equals("Name cannot be null," +
                " cannot be less than 3 and more than 100"), "Rule 4");
        check(exceptions.get(0).getFieldName().equals("Title"), "Rule 4");
    }

    static void ruleFive() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule, priceValidationRule,
                descriptionValidationRule);
        Product product = new Product("Example", null, "Example");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.get(0).getRuleName().equals("Price validation"), "Rule 5");
        check(exceptions.get(0).getDescription().equals("Price must not be empty," +
                " must contain only digits, cannot be 0"), "Rule 5");
        check(exceptions.get(0).getFieldName().equals("Price"), "Rule 5");
    }

    static void ruleSix() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule, priceValidationRule,
                descriptionValidationRule);
        Product product = new Product("Example", 0, "Example");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.get(0).getRuleName().equals("Price validation"), "Rule 6");
        check(exceptions.get(0).getDescription().equals("Price must not be empty," +
                " must contain only digits, cannot be 0"), "Rule 6");
        check(exceptions.get(0).getFieldName().equals("Price"), "Rule 6");
    }

    static void ruleSeven() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule,
                priceValidationRule, descriptionValidationRule);
        Product product = new Product("Example1", 1, "A".repeat(2001));
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.get(0).getRuleName().equals("Description validation"), "Rule 7");
        check(exceptions.get(0).getDescription().equals("Must not be longer than 2000 characters," +
                " must contain only English letters and numbers, other characters are not allowed"),
                "Rule 7");
        check(exceptions.get(0).getFieldName().equals("Description"), "Rule 7");
    }

    static void ruleEight() {
        ProductValidation validator = new ProductValidationImpl(productTitleValidationRule,
                priceValidationRule, descriptionValidationRule);
        Product product = new Product(null, null,"%$");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.contains(new ValidationException("Title validation",
                "Name cannot be null, cannot be less than 3 and more than 100",
                "Title")), "Rule 8");
        check(exceptions.contains(new ValidationException("Price validation",
                "Price must not be empty, must contain only digits, cannot be 0",
                "Price")), "Rule 8");
        check(exceptions.get(2).getRuleName().equals("Description validation"), "Rule 8");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
