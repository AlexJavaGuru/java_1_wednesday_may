package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_31;

class LibraryDemo {

    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        Book book1 = new Book(" Clean code", "Martin Roberts");
        Book book2 = new Book(" Introduction to Algorithms", "Thomas H");
        User user = new User("User1");
        Debt debt = new Debt(user);
        UserCard userCard = new UserCard(user, bookRepository, debt);

        bookRepository.addBookInLibrary(book1);
        bookRepository.addBookInLibrary(book2);

        userCard.takeBook(book1, user);
        userCard.nextDay();
        userCard.nextDay();
        userCard.nextDay();
        userCard.nextDay();
        userCard.nextDay();
        userCard.nextDay();
        userCard.nextDay();
        userCard.payTheDebt();
        userCard.letBookBack(book1);
    }

}
