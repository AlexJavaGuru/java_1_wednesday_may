package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest runner = new InMemoryDatabaseTest();
        runner.testSaveProduct();
        runner.testGetByTitle();
        runner.testNotGetByTitle();
    }

    void testSaveProduct() {
        InMemoryDatabase testBase = new InMemoryDatabase();
        Product one = new Product("one");
        Product two = new Product("two");
        Product three = new Product("three");
        Product four = new Product("four");
        testBase.save(three);
        testBase.save(one);
        testBase.save(two);
        testBase.save(four);
        List<Product> expectedResult = new ArrayList<>(Arrays.asList(three, one, two, four));
        check(testBase.getListOfProduct().equals(expectedResult), "Test saving products");
    }

    void testGetByTitle() {
        InMemoryDatabase testBase = new InMemoryDatabase();
        Product one = new Product("one");
        Product two = new Product("two");
        Product three = new Product("three");
        Product four = new Product("four");
        testBase.save(three);
        testBase.save(one);
        testBase.save(two);
        testBase.save(four);
        Product result = testBase.findByTitle("two");
        check(result.equals(two), "Test find product by title");
    }

    void testNotGetByTitle() {
        InMemoryDatabase testBase = new InMemoryDatabase();
        Product one = new Product("one");
        Product two = new Product("two");
        Product three = new Product("three");
        Product four = new Product("four");
        testBase.save(three);
        testBase.save(one);
        testBase.save(two);
        testBase.save(four);
        Product result = testBase.findByTitle("for");
        check(result == null, "Test not find product by title");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
