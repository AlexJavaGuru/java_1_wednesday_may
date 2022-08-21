package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

class LibraryBookRepository implements LibraryInterface {
    private Book books[];
    private int bookId;

    void addBook(Book book) {
        //добавляем книгу и даём ей Айди
    }

    @Override
    public void orderBook(String bookInfo) {
        //меняет статус книги
    }

    @Override
    public void takeBook(Book book, User user) {
        //также меняет статус книги и сохраняет всю инфу
    }

    @Override
    public void returnBook(Book book) {
        //меняет статус книги на возвращённую
    }

    @Override
    public void editData(int dataToChange) {
        // меню где можно менять информацию о книге
    }

    @Override
    public void findInfoByID(int id) {
        //вся информация о книге по ID
    }
}
