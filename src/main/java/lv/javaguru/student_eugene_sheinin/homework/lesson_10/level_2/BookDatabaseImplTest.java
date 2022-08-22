package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2;

public class BookDatabaseImplTest {

    public static void main(String[] args) {
        deleteByIdTest();
        deleteByIdBookObjTest();
        findByIdTest();
        findByAuthorTest();
        findByTitleTest();
        countAllBooksTest();
        deleteByAuthorTest();
        deleteByTitleTest();
    }

    private static void deleteByTitleTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        Book book4 = new Book("Djuma", "Mushketjori 20 let spustja");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.deleteByTitle("Mushketjori");
        check(bookDatabase.countAllBooks() == 2, "deleteByTitleTest");
    }

    private static void deleteByAuthorTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        Book book4 = new Book("Djuma", "Mushketjori 20 let spustja");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.deleteByAuthor("Djuma");
        check(bookDatabase.countAllBooks() == 2, "deleteByAuthorTest");
    }

    private static void countAllBooksTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        Book book4 = new Book("Djuma", "Mushketjori 20 let spustja");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        check(bookDatabase.countAllBooks() == 4, "countAllBooksTest");
    }

    private static void findByTitleTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        Book book4 = new Book("Djuma", "Mushketjori 20 let spustja");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        for (Book book : bookDatabase.findByTitle("Mushketjori")) {
            check(book.getTitle().equals("Mushketjori") ||
                            book.getTitle().equals("Mushketjori 20 let spustja"),
                    "findByTitleTest"
            );
        }
    }

    private static void findByAuthorTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        Book book4 = new Book("Djuma", "Mushketjori 20 let spustja");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        for (Book book : bookDatabase.findByAuthor("Djuma")) {
            check(book.getTitle().equals("Mushketjori") ||
                    book.getTitle().equals("Mushketjori 20 let spustja"),
                    "findByAuthorTest"
            );
        }
    }

    private static void deleteByIdBookObjTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        check(bookDatabase.delete(book2), "deleteByIdBookObjTest");
    }

    private static void deleteByIdTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        check(bookDatabase.delete(2L), "deleteByIdTest");
    }

    private static void findByIdTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        check(
                bookDatabase.findById(2L).
                get().getTitle().equals("Mu-mu"),
                "findByIdTest"
        );
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
