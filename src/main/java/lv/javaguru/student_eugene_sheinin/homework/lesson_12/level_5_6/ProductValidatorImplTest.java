package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_5_6;

import java.util.List;

public class ProductValidatorImplTest {

     private static ProductValidator validator = new ProductValidatorImpl(
            new ProductTitleValidationRule(),
             new ProductPriceValidationRule(),
             new ProductDescriptionValidationRule()
    );

    public static void main(String[] args) {
        testTitleValidation_1();
        testTitleValidation_2();
        testTitleValidation_3();
        testTitleValidation_4();
        testTitleValidation_5();
        testPriceValidation_1();
        testPriceValidation_2();
        testDescriptionValidation_2();
        testDescriptionValidation_3();
        testTitleAndPriceValidation_1();
        testTitleAndPriceValidation_2();
        testTitleAndPriceAndDescriptionValidation_1();
    }

    public static void testTitleValidation_1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestTitleValidation_1");
        check(exceptions.get(0).getRuleName().equals("RULE-1"), "TestTitleValidation_1");
        check(exceptions.get(0).getFieldName().equals("title"), "TestTitleValidation_1");
        check(exceptions.get(0).getDescription().equals("Title can not be empty"), "TestTitleValidation_1");
    }

    public static void testTitleValidation_2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestTitleValidation_2");
        check(exceptions.get(0).getRuleName().equals("RULE-1"), "TestTitleValidation_2");
        check(exceptions.get(0).getFieldName().equals("title"), "TestTitleValidation_2");
        check(exceptions.get(0).getDescription().equals("Title can not be empty"), "TestTitleValidation_2");
    }

    public static void testTitleValidation_3() {
        Product product = new Product("tt", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestTitleValidation_3");
        check(exceptions.get(0).getRuleName().equals("RULE-2"), "TestTitleValidation_3");
        check(exceptions.get(0).getFieldName().equals("title"), "TestTitleValidation_3");
        check(exceptions.get(0).getDescription().equals("Title can not be less 3 symbol"), "TestTitleValidation_3");
    }


    public static void testTitleValidation_4() {

        StringBuilder title = new StringBuilder();
        for (int i = 0; i <= 101; i++) {
            title.append("t");
        }

        Product product = new Product(title.toString(), 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestTitleValidation_4");
        check(exceptions.get(0).getRuleName().equals("RULE-3"), "TestTitleValidation_4");
        check(exceptions.get(0).getFieldName().equals("title"), "TestTitleValidation_4");
        check(exceptions.get(0).getDescription().equals("Title can not be more than 100 symbol"), "TestTitleValidation_4");
    }

    public static void testTitleValidation_5() {
        Product product = new Product("dfg343$", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestTitleValidation_5");
        check(exceptions.get(0).getRuleName().equals("RULE-4"), "TestTitleValidation_5");
        check(exceptions.get(0).getFieldName().equals("title"), "TestTitleValidation_5");
        check(exceptions.get(0).getDescription().equals("Title contain only [a-zA-Z\\d] symbols"), "TestTitleValidation_5");
    }

    public static void testPriceValidation_1() {
        Product product = new Product("newProduct", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestPriceValidation_1");
        check(exceptions.get(0).getRuleName().equals("RULE-5"), "TestPriceValidation_1");
        check(exceptions.get(0).getFieldName().equals("price"), "TestPriceValidation_1");
        check(exceptions.get(0).getDescription().equals("Price can not be empty"), "TestPriceValidation_1");
    }



    public static void testPriceValidation_2() {
        Product product = new Product("newProduct", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestPriceValidation_2");
        check(exceptions.get(0).getRuleName().equals("RULE-6"), "TestPriceValidation_2");
        check(exceptions.get(0).getFieldName().equals("price"), "TestPriceValidation_2");
        check(exceptions.get(0).getDescription().equals("Price should be more than 0"), "TestPriceValidation_2");
    }

    public static void testDescriptionValidation_2() {
        StringBuilder description = new StringBuilder();
        for (int i = 0; i <= 2001; i++) {
            description.append("t");
        }
        Product product = new Product("newProduct", 2, description.toString());
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestDescriptionValidation_2");
        check(exceptions.get(0).getRuleName().equals("RULE-7"), "TestDescriptionValidation_2");
        check(exceptions.get(0).getFieldName().equals("description"), "TestDescriptionValidation_2");
        check(exceptions.get(0).getDescription().equals("Description can not be more than 2000 symbol"), "TestDescriptionValidation_2");
    }

    public static void testDescriptionValidation_3() {
        Product product = new Product("newProduct", 2, "0sdc1#");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 1, "TestDescriptionValidation_3");
        check(exceptions.get(0).getRuleName().equals("RULE-8"), "TestDescriptionValidation_3");
        check(exceptions.get(0).getFieldName().equals("description"), "TestDescriptionValidation_3");
        check(exceptions.get(0).getDescription().equals("Description contain only [a-zA-Z] symbols"), "TestDescriptionValidation_3");
    }

    public static void testTitleAndPriceValidation_1() {
        Product product = new Product("dfs#", null, "0sdc1");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 2, "TestTitleAndPriceValidation_1");
        check(exceptions.get(0).getRuleName().equals("RULE-4"), "TestTitleAndPriceValidation_1");
        check(exceptions.get(0).getFieldName().equals("title"), "TestTitleAndPriceValidation_1");
        check(exceptions.get(0).getDescription().equals("Title contain only [a-zA-Z\\d] symbols"), "TestTitleAndPriceValidation_1");
        check(exceptions.get(1).getRuleName().equals("RULE-5"), "TestTitleAndPriceValidation_1");
        check(exceptions.get(1).getFieldName().equals("price"), "TestTitleAndPriceValidation_1");
        check(exceptions.get(1).getDescription().equals("Price can not be empty"), "TestTitleAndPriceValidation_1");
    }

    public static void testTitleAndPriceValidation_2() {
        Product product = new Product("dfsd", null, "0sdc1$");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 2, "TestTitleAndPriceValidation_2");
        check(exceptions.get(0).getRuleName().equals("RULE-5"), "TestTitleAndPriceValidation_2");
        check(exceptions.get(0).getFieldName().equals("price"), "TestTitleAndPriceValidation_2");
        check(exceptions.get(0).getDescription().equals("Price can not be empty"), "TestTitleAndPriceValidation_2");
        check(exceptions.get(1).getRuleName().equals("RULE-8"), "TestTitleAndPriceValidation_2");
        check(exceptions.get(1).getFieldName().equals("description"), "TestTitleAndPriceValidation_2");
        check(exceptions.get(1).getDescription().equals("Description contain only [a-zA-Z] symbols"), "TestTitleAndPriceValidation_2");
    }

    public static void testTitleAndPriceAndDescriptionValidation_1() {
        Product product = new Product("dfsd#", null, "0sdc1$");
        List<ValidationException> exceptions = validator.validate(product);
        check(exceptions.size() == 3, "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(0).getRuleName().equals("RULE-4"), "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(0).getFieldName().equals("title"), "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(0).getDescription().equals("Title contain only [a-zA-Z\\d] symbols"), "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(1).getRuleName().equals("RULE-5"), "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(1).getFieldName().equals("price"), "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(1).getDescription().equals("Price can not be empty"), "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(2).getRuleName().equals("RULE-8"), "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(2).getFieldName().equals("description"), "TestTitleAndPriceAndDescriptionValidation_1");
        check(exceptions.get(2).getDescription().equals("Description contain only [a-zA-Z] symbols"), "TestTitleAndPriceAndDescriptionValidation_1");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
