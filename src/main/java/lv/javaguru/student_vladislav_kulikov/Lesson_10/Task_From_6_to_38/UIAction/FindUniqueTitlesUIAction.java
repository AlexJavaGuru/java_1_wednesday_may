package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.BookDatabase;

import java.util.Set;

public class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> result = bookDatabase.findUniqueTitles();
        System.out.println(result);
        System.out.println(" ");
    }
}
