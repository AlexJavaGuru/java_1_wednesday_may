package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.library_management;

import java.util.Date;

public class Customer extends User{

    private LibraryCard libraryCard;

    public Customer(String name, String surname, Date birth) {
        super(name, surname, birth);
    }
}
