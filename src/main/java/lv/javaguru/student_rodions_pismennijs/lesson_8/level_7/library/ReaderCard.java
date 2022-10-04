package lv.javaguru.student_rodions_pismennijs.lesson_8.level_7.library;

import java.util.List;

class ReaderCard {

    private Long id;
    private Reader reader;
    private List<Book> takenBooks;

    public void returnTheBook(Book book) {
        Book findBook = null;
        for (Book takenBook : takenBooks) {
            if (takenBook.equals(book)) {
                findBook = takenBook;
            }
        }
        takenBooks.remove(findBook);
    }

    public void assignBookToTheCard(Book book) {
        takenBooks.add(book);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public List<Book> getTakenBooks() {
        return takenBooks;
    }

    public void setTakenBooks(List<Book> takenBooks) {
        this.takenBooks = takenBooks;
    }
}
