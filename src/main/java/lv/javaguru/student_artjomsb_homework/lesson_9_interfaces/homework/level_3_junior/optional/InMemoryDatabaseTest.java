package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior.optional;

import java.util.Optional;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest runner = new InMemoryDatabaseTest();
        runner.testGetByTitle();
        runner.testNotGetByTitle();
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
        Optional<Product> result = testBase.findByTitle("two");
        Optional<Product> expectedResult = Optional.of(two);
        check(result.equals(expectedResult), "Test find product by title");
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
        Optional<Product> result = testBase.findByTitle("for");
        check(result.isEmpty(), "Test not find product by title");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
