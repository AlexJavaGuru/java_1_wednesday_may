package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
//Этот интерфейс не является функциональным, так как содержит больше одного абстракного метода
