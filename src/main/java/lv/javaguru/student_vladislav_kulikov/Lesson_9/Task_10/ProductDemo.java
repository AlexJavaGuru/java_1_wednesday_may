package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_10;

import java.util.Optional;

class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("Banana");
        Product product2 = new Product("Tomato");
        Product[] products = new Product[1];
        InMemoryDatabase database = new InMemoryDatabase(products);
        database.save(product);
        database.save(product2);

        Optional<Product> result = database.findByTitle("Banana");
        Optional<Product> result2 = database.findByTitle("Tomato");

        System.out.println(result);
        System.out.println(result2);
    }

}
