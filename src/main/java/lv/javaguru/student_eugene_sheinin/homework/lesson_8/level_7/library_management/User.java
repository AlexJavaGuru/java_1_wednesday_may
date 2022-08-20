package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.library_management;

import java.util.Date;

class User {
    private String name;
    private String surname;
    private Date birth;

    public User(String name, String surname, Date birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirth() {
        return birth;
    }
}
