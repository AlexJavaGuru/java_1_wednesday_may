package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38;

class BookDemo {

    public static void main(String[] args) {
        Book book = new Book("Example", "Example", null);
        Book book2 = new Book("Example2", "Example2", null);
        Book book3 = new Book("Example2", "Example2", null);
        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();
        bookDataBase.save(book);
        bookDataBase.save(book2);
        bookDataBase.save(book3);

        System.out.println(bookDataBase.countAllBooks());
    }
}
