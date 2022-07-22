package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

class UserReserved extends User implements UserInterface {
    private String dateOfBookTaken;
    private String dateOfBookBack;
    private double penalty;
    private Book takenBook;

    public UserReserved(String userName, String surname, int phoneNumber, String dateOfBookTaken, String dateOfBookBack, double penalty, Book takenBook) {
        super(userName, surname, phoneNumber);
        this.dateOfBookTaken = dateOfBookTaken;
        this.dateOfBookBack = dateOfBookBack;
        this.penalty = penalty;
        this.takenBook = takenBook;
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


    @Override
    public User showInfo(int phoneNumber) {
        //вся информация о пользователе
        return null;
    }

    @Override
    public void orderBook(String bookInfo) {
        //Делать резервацию книги, можно только 1 книгу на руки
    }

    @Override
    public void editData(int dataToChange) {
//Выбирает из меню что менять
    }

    @Override
    public void findBook(String author, String bookName) {
//поиск книги
    }
}
