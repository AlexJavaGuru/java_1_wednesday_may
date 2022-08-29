package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

class UserReserved extends User {
    private String dateOfBookTaken;
    private String dateOfBookBack;
    private double penalty;
    private Book takenBook;
    private int reservedBookID;

    public UserReserved(String userName, String surname, int phoneNumber, String dateOfBookTaken, String dateOfBookBack, double penalty, Book takenBook) {
        super(userName, surname, phoneNumber);
        this.dateOfBookTaken = dateOfBookTaken;
        this.dateOfBookBack = dateOfBookBack;
        this.penalty = penalty;
        this.takenBook = takenBook; // по сути я ещё думал добавить можно просто по ID, чтобы не вся книга была а только её Айди
        this.reservedBookID = -1; // но проблема с Айди какой дефолтный параметр указать, если нету резервации. -1 это думаю не правильно и не очень корректно
    }

    void payPenalty() {
        //погашение задолжности
    }

    void extendData() {
        //продлить срок сдачи
    }

    @Override
    public String toString() {
        return "UserReserved{" +
                "dateOfBookTaken='" + dateOfBookTaken + '\'' +
                ", dateOfBookBack='" + dateOfBookBack + '\'' +
                ", penalty=" + penalty +
                ", takenBook=" + takenBook +
                ", userName='" + userName + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
