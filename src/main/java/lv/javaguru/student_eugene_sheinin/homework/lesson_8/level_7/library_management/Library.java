package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.library_management;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

abstract class Library {

    String address;
    List<Employee> employee;
    List<Book> books;

    List<Reservation> reservations;

    public List<Reservation> getReservations() {
        return reservations;
    }

    abstract public List<Book> getAllBooks();
    abstract public List<Book> getAvailableBooks();
    abstract public List<Employee> getEmployees();
    abstract public List<Customer> getReaders();
    abstract public void addBook(Book book);
    abstract public void deleteBook(Book book);

}
