package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.BookDatabase;

import java.util.Map;

public class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String ,Integer> result = bookDatabase.getEachAuthorBookCount();
        if(result.isEmpty()) {
            System.out.println("At the moment there is no data");
            System.out.println(" ");
        } else {
            System.out.println(result);
            System.out.println(" ");
        }
    }
}
