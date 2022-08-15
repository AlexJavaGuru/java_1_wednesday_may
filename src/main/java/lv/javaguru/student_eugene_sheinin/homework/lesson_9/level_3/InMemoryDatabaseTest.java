package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_3;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        testSaveAndFindProduct();
    }

    static void testSaveAndFindProduct() {
        Product product =  new Product("Milk");
        ProductDatabase productDatabase = new InMemoryDatabase();
        productDatabase.save(product);
        check(
                productDatabase.findByTitle("Milk").getTitle().equals("Milk"),
                "testSaveAndFindProduct"
        );
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
