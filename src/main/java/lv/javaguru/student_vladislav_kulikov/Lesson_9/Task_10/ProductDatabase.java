package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_10;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
