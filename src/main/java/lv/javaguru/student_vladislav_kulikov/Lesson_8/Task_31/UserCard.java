package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_31;

class UserCard {

    private User user;
    private BookRepository bookRepository;
    private Debt debt;

    UserCard(User user, BookRepository bookRepository, Debt debt) {
        this.user = user;
        this.bookRepository = bookRepository;
        this.debt = debt;
    }

    void takeBook(Book book, User user) {
        bookRepository.takeBookFromLibrary(book, user);
        debt.setDayOfTheDebt(debt.getDayOfTheDebt()+7);
    }

    void letBookBack(Book book) {
        bookRepository.letBookBackToLibrary(book, user);
    }

    void payTheDebt() {
        debt.payDebt();
    }

    void nextDay() {
        debt.timer();
        debt.checkTimer();
    }
}
