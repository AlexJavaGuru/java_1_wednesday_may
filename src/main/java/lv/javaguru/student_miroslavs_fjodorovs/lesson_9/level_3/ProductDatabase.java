package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_3;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
