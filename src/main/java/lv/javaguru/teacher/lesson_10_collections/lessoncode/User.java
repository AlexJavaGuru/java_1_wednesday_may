package main.java.lv.javaguru.teacher.lesson_10_collections.lessoncode;

import java.util.Objects;

class User {
    protected String userName;
    protected String surname;
    protected int phoneNumber;

    public User(String userName, String surname, int phoneNumber) {
        this.userName = userName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return phoneNumber == user.phoneNumber &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, surname, phoneNumber);
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
