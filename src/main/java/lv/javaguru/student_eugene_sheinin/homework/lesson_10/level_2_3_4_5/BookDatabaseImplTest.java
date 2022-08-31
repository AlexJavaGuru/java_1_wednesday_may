package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

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
        findBySearchCriteria();
        findUniqueAuthors();
        findUniqueTitles();
        findUniqueBooks();
        containsTest();
        getEachAuthorBookCountTest();
        getEachAuthorBookCountTest2();
        getAuthorToBooksMap();
    }

    private static void getAuthorToBooksMap() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Turgenev", "Mu-mu");
        Book book4 = new Book("Djuma", "Mushketjori");
        Book book5 = new Book("Djuma", "Mushketjori2");
        Book book6 = new Book("Djuma", "Mushketjor3");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);
        check(bookDatabase.getAuthorToBooksMapV2().get("Turgenev").size() == 2, "getAuthorToBooksMap");
    }

    private static void getEachAuthorBookCountTest2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Turgenev", "Mu-mu");
        Book book4 = new Book("Djuma", "Mushketjori");
        Book book5 = new Book("Djuma", "Mushketjori2");
        Book book6 = new Book("Djuma", "Mushketjor3");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);
        check(bookDatabase.getEachAuthorBookCount().get("Turgenev") == 1, "getEachAuthorBookCountTest2");
    }

    private static void getEachAuthorBookCountTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Turgenev", "Mu-mu");
        Book book4 = new Book("Djuma", "Mushketjori");
        Book book5 = new Book("Djuma", "Mushketjori2");
        Book book6 = new Book("Djuma", "Mushketjor3");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);
        check(bookDatabase.getEachAuthorBookCount().get("Djuma") == 3, "getEachAuthorBookCountTest");
    }

    private static void containsTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Turgenev", "Mu-mu");
        Book book4 = new Book("Djuma", "Mushketjori");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Book bookCheck =  new Book("Turgenev", "Mu-mu");
        bookCheck.setId(2L);
        check(bookDatabase.contains(bookCheck), "containsTest");
    }

    private static void findUniqueBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Turgenev", "Mu-mu");
        Book book4 = new Book("Djuma", "Mushketjori");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        check(bookDatabase.findUniqueBooks().size() == 3, "findUniqueBooks");
    }

    private static void findUniqueTitles() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Turgenev2", "Mu-mu");
        Book book4 = new Book("Djuma", "Mushketjori");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        check(bookDatabase.findUniqueTitles().size() == 3, "findUniqueTitles");
    }

    private static void findUniqueAuthors() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        Book book4 = new Book("Djuma", "Mushketjori 20 let spustja");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        check(bookDatabase.findUniqueAuthors().size() == 3, "findUniqueAuthors");
    }

    private static void findBySearchCriteria(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Onegin");
        Book book2 = new Book("Turgenev", "Mu-mu");
        Book book3 = new Book("Djuma", "Mushketjori");
        Book book4 = new Book("Djuma", "Mushketjori 20 let spustja");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        SearchCriteria searchCriteria = new OrSearchCriteria(
                new TitleSearchCriteria("Mu-mu"),
                new AuthorSearchCriteria("Djuma")
        );

        check(bookDatabase.find(searchCriteria).size() == 3,
                "findBySearchCriteria"
        );
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
