package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_6;

import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.Book;
import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.BookDatabase;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите все данные о книге с консоли у пользолвателя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author");
        String author = scanner.next();
        System.out.println("Enter Title");
        String title = scanner.next();
        System.out.println("Enter Year");
        String year = scanner.next();
        Book newBook = new Book(author, title, year);
        this.bookDatabase.save(newBook);

    }

}
