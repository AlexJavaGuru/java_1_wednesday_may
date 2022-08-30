package lv.javaguru.student_rodions_pismennijs.lesson_9.level_5;

interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    String getAllBooks();

    String getBookByAuthor(String author);

}
