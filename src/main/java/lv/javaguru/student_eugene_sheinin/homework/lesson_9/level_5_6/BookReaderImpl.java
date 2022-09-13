package lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_5_6;

import java.util.List;
import java.util.ArrayList;

class BookReaderImpl implements BookReader{
    private List<Book> allBookList =  new ArrayList<>();
    private List<Book> readedBookList =  new ArrayList<>();
    private List<Book> unreadedBookList =  new ArrayList<>();

    @Override
    public boolean markAsReadBook(Book book) {
        if(isBookInLibrary(book)) {
            unreadedBookList.remove(book);
            readedBookList.add(book);
            return true;
        }

        return false;
    }

    @Override
    public boolean markAsUnreadBook(Book book) {
        if(isBookInLibrary(book)) {
            unreadedBookList.add(book);
            readedBookList.remove(book);
            return true;
        }

        return false;
    }

    @Override
    public boolean addBook(Book book){
        if(isBookInLibrary(book) || isEmptyTitleOrAuthor(book)){
           return false;
        }

        allBookList.add(book);
        unreadedBookList.add(book);

        return true;
    }

    public List<Book> getReadedBookList() {
        printBooks(readedBookList);

        return readedBookList;
    }

    public List<Book> getNotReadedBookList() {
        printBooks(unreadedBookList);

        return unreadedBookList;
    }

    public boolean removeBook(Book book) {
        if(!isBookInLibrary(book)) {
            return false;
        }

        return actualBookRemove(book);
    }

    private boolean actualBookRemove(Book book) {
        for(Book bookInLibrary: allBookList) {
            if(bookInLibrary.equals(book)) {
                return allBookList.remove(bookInLibrary);
            }
        }

        return false;
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        List<Book> foundedBooks = new ArrayList<>();
        for(Book bookInLibrary: allBookList) {
            if(bookInLibrary.getTitle().equals(title.trim())
                    || bookInLibrary.getTitle().toLowerCase().contains(title.toLowerCase())
            ) {
                foundedBooks.add(bookInLibrary);
            }
        }

        return foundedBooks;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundedBooks = new ArrayList<>();
        for(Book bookInLibrary: allBookList) {
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
        for(Book bookInLibrary: allBookList) {
            //equals method is overriden in Book class
            if(bookInLibrary.equals(book)) {
                return true;
            }
        }

        return false;
    }



    public List getBooks() {

        printBooks(allBookList);

        return allBookList;
    }

    private void printBooks(List<Book> bookList) {
        for(Book bookInLibrary: bookList) {
            System.out.println(bookInLibrary.getTitle() + " [" + bookInLibrary.getAuthor() + "]");
        }
    }

}
