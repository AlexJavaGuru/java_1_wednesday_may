package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ShowMenuUIAction implements UIAction {
    private List<String> menuOptions = new ArrayList<>(Arrays.asList("1 - Save book",
            "2 - Find book by ID",
            "3 - Find book by author",
            "4 - Find book by title",
            "5 - Delete book by ID",
            "6 - Count all books",
            "7 - Delete book by author",
            "8 - Delete book by title",
            "9 - Get list of books",
            "10 - Find unique authors",
            "11 - Find unique titles",
            "12 - Find unique books",
            "13 - Get author to books",
            "14 - Get each author book count",
            "15 - Show menu",
            "0 - Exit"));

    public void execute() {
        for (String option : menuOptions) {
            System.out.println(option);
        }
    }
}
