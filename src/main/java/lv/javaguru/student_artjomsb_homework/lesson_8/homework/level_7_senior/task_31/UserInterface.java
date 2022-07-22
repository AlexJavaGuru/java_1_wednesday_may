package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

interface UserInterface {
    User showInfo(int phoneNumber);

    void orderBook(String bookInfo);

    void editData(int dataToChange);

    void findBook(String author,String bookName);
}
