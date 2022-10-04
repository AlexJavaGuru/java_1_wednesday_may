package lv.javaguru.student_rodions_pismennijs.lesson_8.level_7.library;

import java.util.List;

class Library {

    private List<Book> books;
    private List<ReaderCard> readerCards;

    public void takeTheBook(ReaderCard readerCard, Book book) {
        if (readerCards.contains(readerCard) && isBookAvailable(book)) {
            for (ReaderCard card : readerCards) {
                if (card.getId().equals(readerCard.getId())) {
                    card.assignBookToTheCard(book);
                }
            }
        }
    }

    private boolean isBookAvailable(Book bookToCheck) {
        for (Book book : books) {
            if (book.equals(bookToCheck) && !book.isTaken()) {
                return true;
            }
        }
        return false;
    }

    public void addNewBook(Book book) {
        books.add(book);
    }

    public Book findBook(Book bookToFind) {
        for (Book book : books) {
            if (book.equals(bookToFind)) {
                return book;
            }
        }
        return null;
    }
}
