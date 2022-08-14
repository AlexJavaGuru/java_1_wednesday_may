package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements ProductDatabase {
    private List<Product> listOfProduct = new ArrayList<>();

    @Override
    public void save(Product product) {
        listOfProduct.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : listOfProduct) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

    List<Product> getListOfProduct() {
        return listOfProduct;
    }
}
