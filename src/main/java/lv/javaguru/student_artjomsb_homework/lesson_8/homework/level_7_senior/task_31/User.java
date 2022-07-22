package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

class User implements UserInterface{
    protected String userName;
    protected String surname;
    protected int phoneNumber;

    public User(String userName, String surname, int phoneNumber) {
        this.userName = userName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public User showInfo(int phoneNumber) {
        //также вся инфа о пользователе
        return null;
    }

    @Override
    public void orderBook(String bookInfo) {
        //тут просто пользователь резервирует книгу
    }

    @Override
    public void editData(int dataToChange) {
        //меняет инфу о себе
    }

    @Override
    public void findBook(String author, String bookName) {
//поиск книги
    }
}
