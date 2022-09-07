package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Zveroboi", "Kuper", "");
        Book book2 = new Book("", "Kuper", "1890");
        Book book3 = new Book("", "Kuper", "");

        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);
        System.out.println(searchCriteria1.match(book1));

        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        System.out.println(searchCriteria2.match(book2));

        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        System.out.println(searchCriteria3.match(book3));
    }
}
