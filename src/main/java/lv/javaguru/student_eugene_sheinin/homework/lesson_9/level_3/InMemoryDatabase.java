package lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase{

    List<Product> products = new ArrayList();

    public void save(Product product) {
        products.add(product);
    }

    public Product findByTitle(String productTitle) {

        for (Product product:products) {
            Optional<Product> checkNull = Optional.ofNullable(product);
            if(checkNull.isPresent() &&
                    checkNull.get().getTitle().equals(productTitle)
            ) {
                return product;
            }
        }

        return null;
    }
}
