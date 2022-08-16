package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_5;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

class BookReaderImpl implements BookReader{
    List<Book> bookList =  new ArrayList<>();

    @Override
    public boolean addBook(Book book){
        if(isBookInLibrary(book) || isEmptyTitleOrAuthor(book)){
           return false;
        }

        bookList.add(book);

        return true;
    }

    public boolean removeBook(Book book) {
        if(!isBookInLibrary(book)) {
            return false;
        }

        return actualBookRemove(book);
    }

    private boolean actualBookRemove(Book book) {
        for(Book bookInLibrary:bookList) {
            if(bookInLibrary.equals(book)) {
                return bookList.remove(bookInLibrary);
            }
        }

        return false;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundedBooks = new ArrayList<>();
        for(Book bookInLibrary:bookList) {
            if(bookInLibrary.getAuthor().equals(author.trim())
            || bookInLibrary.getAuthor().toLowerCase().contains(author.toLowerCase())
            ) {
                foundedBooks.add(bookInLibrary);
            }
        }

        return foundedBooks;
    }


    private boolean isEmptyTitleOrAuthor(Book book) {

        return book.getAuthor().isBlank() || book.getTitle().isBlank();
    }


    private boolean isBookInLibrary(Book book) {
        for(Book bookInLibrary:bookList) {
            //equals method is overriden in Book class
            if(bookInLibrary.equals(book)) {
                return true;
            }
        }

        return false;
    }



    public List getBooks() {

        printBooks();

        return bookList;
    }

    private void printBooks() {
        for(Book bookInLibrary:bookList) {
            System.out.println(bookInLibrary.getTitle() + " [" + bookInLibrary.getAuthor() + "]");
        }
    }

}
