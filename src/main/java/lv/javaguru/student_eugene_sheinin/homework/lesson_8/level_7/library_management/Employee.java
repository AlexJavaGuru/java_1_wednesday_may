package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.library_management;

import java.util.Date;

public class Employee extends User {

    Library workPlace;

    public Employee(String name, String surname, Date birth) {
        super(name, surname, birth);
    }
}
