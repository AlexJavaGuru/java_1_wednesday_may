package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_8;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
