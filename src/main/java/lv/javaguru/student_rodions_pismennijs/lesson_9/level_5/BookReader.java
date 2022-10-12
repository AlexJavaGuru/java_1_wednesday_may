package lv.javaguru.student_rodions_pismennijs.lesson_9.level_5;

interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    String getAllBooks();

    String getBooksByAuthor(String author);

    String getBooksByTitle(String title);

    boolean markBookAsRead(Book book);

    boolean markBookAsUnread(Book book);

    String getAllReadBooks();

    String getAllUnreadBooks();
}
