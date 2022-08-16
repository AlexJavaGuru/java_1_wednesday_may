package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

interface LibraryInterface {

    void orderBook(String bookInfo);
    void takeBook(Book book,User user);
    void returnBook(Book book);

    void editData(int dataToChange);

    void findInfoByID(int id);

}
