package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

import java.util.List;

class ProductValidatorImplTest {
    private final ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    private final ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    private final ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();
    private final ProductValidator validator = new ProductValidatorImpl(titleValidationRule, priceValidationRule, descriptionValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule4_v2();
        test.rule5_v1();
        test.rule5_v2();
        test.rule6_v1();
        test.rule7_v1();
        test.rule7_v2();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("First RULE"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Can't be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("First RULE"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Can't be empty"), "rule1");
    }

    private void rule2_v1() {
        Product product = new Product("Ab", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("Second RULE"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Can't be shorter than 3 characters"), "rule2");
    }

    private void rule3_v1() {
        String loopString = "abcdefg";
        for (int i = 0; i < 5; i++) {
            loopString = loopString.concat(loopString);
        }
        Product product = new Product(loopString, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("Third RULE"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Can't be longer than 100 characters"), "rule3");
    }

    private void rule4_v1() {
        Product product = new Product("Ab=cd", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("Fourth RULE"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Only contain English letters and digits"), "rule4");
    }

    private void rule4_v2() {
        Product product = new Product("Абвгд", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("Fourth RULE"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Only contain English letters and digits"), "rule4");
    }

    private void rule5_v1() {
        Product product = new Product("Title", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("Price RULE"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price can't be 0 or smaller"), "rule6");
    }

    private void rule5_v2() {
        Product product = new Product("Title", -1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("Price RULE"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price can't be 0 or smaller"), "rule6");
    }

    private void rule6_v1() {
        String loopString = "abcdefg";
        for (int i = 0; i < 10; i++) {
            loopString = loopString.concat(loopString);
        }
        Product product = new Product("Test", 1, loopString);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("Description RULE one"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description can't be longer than 2000 characters"), "rule7");
    }

    private void rule7_v1() {
        Product product = new Product("Title", 1, "-description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("Description RULE two"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Contain English letters and digits"), "rule8");
    }

    private void rule7_v2() {
        Product product = new Product("Test", 1, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("Description RULE two"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Contain English letters and digits"), "rule8");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
