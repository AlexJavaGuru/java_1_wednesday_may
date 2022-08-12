package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);
}
