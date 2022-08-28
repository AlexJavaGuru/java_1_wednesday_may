package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    private List<Product> listOfProduct = new ArrayList<>();

    @Override
    public void save(Product product) {
        listOfProduct.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : listOfProduct) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
