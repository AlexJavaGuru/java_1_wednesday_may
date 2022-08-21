package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_8;

class ProductTest {

    public static void main(String[] args) {
        saveAndFindTest();
    }

   static void saveAndFindTest() {
        Product[] products = new Product[1];
        InMemoryDatabase database = new InMemoryDatabase(products);
        Product product = new Product("Apple");
        database.save(product);
        Product result = database.findByTitle("Apple");
        check(result.equals(product), "Test Save");
    }

   static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
