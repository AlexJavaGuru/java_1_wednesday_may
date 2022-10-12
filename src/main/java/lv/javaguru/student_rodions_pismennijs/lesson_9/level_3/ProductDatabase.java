package lv.javaguru.student_rodions_pismennijs.lesson_9.level_3;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
