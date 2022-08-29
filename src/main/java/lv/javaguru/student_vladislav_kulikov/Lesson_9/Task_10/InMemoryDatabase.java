package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_10;

import java.util.Objects;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    Product[] products;


    InMemoryDatabase(Product[] products) {
        this.products = products;
    }

    @Override
    public void save(Product product) {
        Product[] productsCopy = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            if (products[0] == null) {
                products[0] = product;
            } else {
                for (int j = 0; j < products.length; j++) {
                    productsCopy[j] = products[j];
                }
                products = productsCopy;
                for (int l = 0; l < products.length; l++) {
                    products[products.length - 1] = product;
                }
            }
        }
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (Objects.equals(product.getTitle(), productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}