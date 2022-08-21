package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_8;

class ProductDemo {

    public static void main(String[] args) {
        Product[] products = new Product[1];
        InMemoryDatabase database = new InMemoryDatabase(products);
        Product product = new Product("Banana");
        Product product2 = new Product("Tomato");

        database.save(product);
        database.save(product2);

        Product result = database.findByTitle("Banana");
        Product result2 = database.findByTitle("Tomato");
        System.out.println(result);
        System.out.println(result2);
    }

}
