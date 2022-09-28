package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_2;

class User {

    String name;
    String surname;

    User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
