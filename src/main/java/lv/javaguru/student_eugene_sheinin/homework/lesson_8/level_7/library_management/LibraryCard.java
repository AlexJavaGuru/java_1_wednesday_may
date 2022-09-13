package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.library_management;

import java.util.Date;
import java.util.List;
import java.util.Map;

class LibraryCard {
    private Library library;
    private Customer customer;
    private Map<Book, Date> expirationReturnDates;
    private List<Reservation> reservations;

    public LibraryCard(Customer customer) {
        this.customer = customer;
    }
}
