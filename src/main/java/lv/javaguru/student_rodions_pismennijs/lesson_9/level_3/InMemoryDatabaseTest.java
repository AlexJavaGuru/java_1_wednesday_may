package lv.javaguru.student_rodions_pismennijs.lesson_9.level_3;

import java.util.Optional;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        testSave();
        testFind();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static void testSave() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product apple = new Product("Apple");
        Product banana = new Product("Banana");
        Product kiwi = new Product("Kiwi");
        inMemoryDatabase.save(apple);
        inMemoryDatabase.save(banana);
        inMemoryDatabase.save(kiwi);
        check(inMemoryDatabase.products.size() == 3, "Save Test");
    }

    static void testFind() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product apple = new Product("Apple");
        Product banana = new Product("Banana");
        Product kiwi = new Product("Kiwi");
        inMemoryDatabase.save(apple);
        inMemoryDatabase.save(banana);
        inMemoryDatabase.save(kiwi);
        Optional<Product> result = inMemoryDatabase.findByTitle("Apple");
        Optional<Product> expResult = Optional.of(apple);
        check(result.equals(expResult), "Find Test");
    }
}
