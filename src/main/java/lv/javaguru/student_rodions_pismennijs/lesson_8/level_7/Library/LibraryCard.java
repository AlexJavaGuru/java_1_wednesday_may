package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_7.Library;

class LibraryCard {

    private User user;
    private Library library;
    private Book book;

    void giveBookToUser(Book book, User user) {
        if (user.getCountOfBooks() < 5)
            library.takeBookFromLibrary(book);


    }

    void returnBookFromUser(Book book) {
        library.returnBookToLibrary(book);
    }

}
