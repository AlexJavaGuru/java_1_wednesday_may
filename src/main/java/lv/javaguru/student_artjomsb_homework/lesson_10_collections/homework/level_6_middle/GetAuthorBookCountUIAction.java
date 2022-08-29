package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.BookDatabase;

class GetAuthorBookCountUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println(bookDatabase.getEachAuthorBookCount());
    }
}
