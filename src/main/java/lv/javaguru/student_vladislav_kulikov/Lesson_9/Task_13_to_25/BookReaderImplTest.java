package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_13_to_25;

import java.util.List;

class BookReaderImplTest {

    public static void main(String[] args) {
        saveBook();
        saveSecondSameBook();
        saveEmptyBook();
        deleteBook();
        deleteEmptyBook();
        getBooks();
        findBookByAuthor();
        findBookByAuthorUltimate();
        findBookByTitle();
        findBookByTitleUltimate();
        markBookAsRead();
        noMarkBookAsRead();
        markBookAsUnread();
        noMarkBookAsUnread();
        theBooksThatAreRead();
        noTheBooksThatAreRead();
    }

    static void saveBook() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Example1", "Example2");
        boolean result = subject.saveBook(book1);
        check(result, "Test save book");
    }

    static void saveSecondSameBook() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Example1", "Example2");
        Book book2 = new Book("Example1", "Example2");
        subject.saveBook(book1);
        boolean result2 = subject.saveBook(book2);
        check(!result2, "Test save second book");
    }

    static void saveEmptyBook() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book(null, null);
        boolean result = subject.saveBook(book1);
        check(!result, "Test save empty Book");
    }

    static void deleteBook() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Example1", "Example2");
        subject.saveBook(book1);
        boolean result = subject.deleteBook(book1);
        check(result, "Test Delete Book");
    }

    static void deleteEmptyBook() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book(null, null);
        subject.saveBook(book1);

        boolean result = subject.deleteBook(book1);

        check(!result, "Test Delete Empty Book");
    }

    static void getBooks() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");
        Book book3 = new Book("Part1", "Example2");

        subject.saveBook(book1);
        subject.saveBook(book2);
        subject.saveBook(book3);

        Book[] bookArray = subject.seeBooksInLibrary();
        String result = "Get Books Test = FAILED";
        for (Book book : bookArray) {
            if (book != null) {
                result = "Get Books Test = OK";
                break;
            }
        }
        System.out.println(result);
    }

    static void findBookByAuthor() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Clean Code", "Robert Martin");
        Book book2 = new Book("The code. Secret language of computer science", "Charles Petzold");
        Book book3 = new Book("Ideal programmer. How to Become a Software Development Professional", "Robert Martin");

        subject.saveBook(book1);
        subject.saveBook(book2);
        subject.saveBook(book3);

        List<Book> result = subject.findBookByAuthor("Robert Martin");

        check(result.contains(book1) && result.contains(book3), "Find Book By Author");
    }

    static void findBookByAuthorUltimate() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Clean Code", "Robert Martin");
        Book book2 = new Book("The code. Secret language of computer science", "Charles Petzold");
        Book book3 = new Book("Ideal programmer. How to Become a Software Development Professional", "Robert Martin");

        subject.saveBook(book1);
        subject.saveBook(book2);
        subject.saveBook(book3);

        List<Book> result = subject.findBookByAuthor("Martin");

        check(result.contains(book1) && result.contains(book3), "Find Book By Author Ultimate");
    }


    static void findBookByTitle() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");

        subject.saveBook(book1);
        subject.saveBook(book2);

        List<Book> result = subject.findBookByTitle("Part1");

        check(result.contains(book1), "Find Book By Title");
    }

    static void findBookByTitleUltimate() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");

        subject.saveBook(book1);
        subject.saveBook(book2);

        List<Book> result = subject.findBookByTitle("P");

        check(result.contains(book1) && result.contains(book2), "Find Book By Title Ultimate");
    }

    static void markBookAsRead() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");
        Book book3 = new Book(null, null);

        subject.saveBook(book1);
        subject.saveBook(book2);

        boolean result = subject.markBookAsRead(book1);
        check(result, "Mark Book As Read");
    }

    static void noMarkBookAsRead() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");
        Book book3 = new Book(null, null);

        subject.saveBook(book1);
        subject.saveBook(book2);

        boolean result = subject.markBookAsRead(book3);
        check(!result, "No Mark Book As Read");
    }

    static void markBookAsUnread() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");
        Book book3 = new Book(null, null);

        subject.saveBook(book1);
        subject.saveBook(book2);

        boolean result = subject.markBookAsUnread(book1);
        check(result, "Mark Book As Unread");
    }

    static void noMarkBookAsUnread() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");
        Book book3 = new Book(null, null);

        subject.saveBook(book1);
        subject.saveBook(book2);

        boolean result = subject.markBookAsUnread(book3);
        check(!result, "No Mark Book As Unread");
    }

    static void theBooksThatAreRead() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");

        subject.saveBook(book1);
        subject.saveBook(book2);
        boolean resultOne = subject.markBookAsRead(book1);
        boolean resultTwo = subject.markBookAsUnread(book2);

        check(resultOne && resultTwo, "The Books That Are Read");

    }

    static void noTheBooksThatAreRead() {
        Book[] books = new Book[0];
        BookReaderImpl subject = new BookReaderImpl(books);
        Book book1 = new Book("Part1", "Example1");
        Book book2 = new Book("Part2", "Example1");
        Book book3 = new Book(null, null);

        subject.saveBook(book1);
        subject.saveBook(book2);
        boolean resultOne = subject.markBookAsRead(book3);
        boolean resultTwo = subject.markBookAsUnread(book3);

        check(!resultOne && !resultTwo, "(False) The Books That Are Read");

    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
