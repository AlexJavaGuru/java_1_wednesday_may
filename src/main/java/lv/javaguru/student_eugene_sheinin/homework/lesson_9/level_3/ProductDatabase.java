package lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_3;

interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
