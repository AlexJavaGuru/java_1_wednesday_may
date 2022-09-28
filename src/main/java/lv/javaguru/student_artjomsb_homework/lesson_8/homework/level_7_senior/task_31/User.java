package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

class User  {
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
}
