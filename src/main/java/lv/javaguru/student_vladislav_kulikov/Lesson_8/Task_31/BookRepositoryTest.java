package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_31;

class BookRepositoryTest {

    public static void main(String[] args) {
        addBookInLibraryAndTakeBookTest();
        letBookBackToLibraryTest();
        debtTest();
    }

    static void addBookInLibraryAndTakeBookTest() {
        BookRepository bookRepository = new BookRepository();
        User user = new User("User1");
        Book book = new Book("Example", "Example");
        bookRepository.addBookInLibrary(book);
        bookRepository.takeBookFromLibrary(book, user);

        if (user.getCountOfBooks() > 0) {
            System.out.println("Add Book To Library And Take Book Test = OK");
            System.out.println(" ");
        } else {
            System.out.println("Add Book To Library And Take Book Test = FAILED");
            System.out.println(" ");
        }
    }

    static void letBookBackToLibraryTest() {
        BookRepository bookRepository = new BookRepository();
        User user = new User("User1");
        Book book = new Book("Example", "Example");
        bookRepository.addBookInLibrary(book);
        bookRepository.takeBookFromLibrary(book, user);
        bookRepository.letBookBackToLibrary(book,user);

        if (user.getCountOfBooks() == 0) {
            System.out.println("Let Book Back To Library Test = OK");
            System.out.println(" ");

        } else {
            System.out.println("Let Book Back To Library Test = FAILED");
            System.out.println(" ");
        }
    }

    static void debtTest() {
        BookRepository bookRepository = new BookRepository();
        User user = new User("User1");
        Book book = new Book("Example", "Example");
        Book book2 = new Book("Example2", "Example2");
        Debt debt = new Debt(user);
        UserCard userCard = new UserCard(user,bookRepository, debt);
        bookRepository.addBookInLibrary(book);
        bookRepository.addBookInLibrary(book2);
        userCard.takeBook(book, user);
        userCard.nextDay();
        userCard.nextDay();
        userCard.nextDay();
        userCard.nextDay();
        userCard.nextDay();// за 3 дня до конца срока предупреждает что надо надо отнести книгу обратно
        userCard.nextDay();
        userCard.nextDay();// говорит что срок закончился и появился долг
        userCard.takeBook(book2, user); // не выдает книгу т.к. есть долг
        userCard.payTheDebt();

        if (user.getDebt() == 0) {
            System.out.println("Debt Test = OK");
        } else {
            System.out.println("Debt Test = FAILED");
        }
    }
}
