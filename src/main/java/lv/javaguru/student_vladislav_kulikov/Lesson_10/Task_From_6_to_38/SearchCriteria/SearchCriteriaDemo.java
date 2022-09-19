package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Book;

class SearchCriteriaDemo {

    public static void main(String[] args) {
        Book book = new Book("Example", "Volume 1", "1900");
        SearchCriteria searchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Example"),
                new TitleSearchCriteria("Volume 1"));
        System.out.println(searchCriteria.match(book));

        Book book2 = new Book("Example2", "Volume 2", "2000");
        SearchCriteria searchCriteria2 = new OrSearchCriteria(new AuthorSearchCriteria("Example2"),
                new YearOfIssueSearchCriteria("2000"));
        System.out.println(searchCriteria2.match(book2));
    }
}
