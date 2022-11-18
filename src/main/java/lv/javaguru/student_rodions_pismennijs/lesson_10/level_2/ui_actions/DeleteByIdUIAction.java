package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type book ID to delete: ");
        Long id = scanner.nextLong();
        boolean delete = bookDatabase.delete(id);
        if (delete) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Whoops.. wrong ID");
        }
    }
}
