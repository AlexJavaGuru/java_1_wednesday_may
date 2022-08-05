package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_8;

import java.util.Objects;

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
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (Objects.equals(product, new Product(productTitle))) {
                return product;
            }
        }
        return null;
    }
}
