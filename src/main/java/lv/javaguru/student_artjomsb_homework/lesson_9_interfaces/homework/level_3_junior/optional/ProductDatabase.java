package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior.optional;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
