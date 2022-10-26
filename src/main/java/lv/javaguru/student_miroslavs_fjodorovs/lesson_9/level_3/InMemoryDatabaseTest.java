package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_3;

import java.util.Optional;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        saveTest();
        findTest();
    }

    static void saveTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product water = new Product("Water");
        Product juice = new Product("Juice");
        Product cola = new Product("Cola");
        Product milk = new Product("Milk");
        inMemoryDatabase.save(water);
        inMemoryDatabase.save(juice);
        inMemoryDatabase.save(cola);
        inMemoryDatabase.save(milk);
        check(inMemoryDatabase.products.size() == 4, "Save Product Test");
    }

    static void findTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product water = new Product("Water");
        Product juice = new Product("Juice");
        Product cola = new Product("Cola");
        Product milk = new Product("Milk");
        inMemoryDatabase.save(water);
        inMemoryDatabase.save(juice);
        inMemoryDatabase.save(cola);
        inMemoryDatabase.save(milk);
        Optional<Product> realResult = inMemoryDatabase.findByTitle("Milk");
        Optional<Product> expectedResult = Optional.of(milk);
        check(realResult.equals(expectedResult), "Find Product Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
