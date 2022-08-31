package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

public class SearchCriteriaDemo {

    public static void main(String[] args) {

        new AndSearchCriteria(
                new AuthorSearchCriteria("Kuper"),
                new TitleSearchCriteria("Zveroboi")
        ).match(
                new Book("Kuper",
                        "Zveroboi"
                )
        );

        new AndSearchCriteria(
            new AuthorSearchCriteria("Kuper"),
            new YearOfIssueSearchCriteria("1890")
        ).match(
            new Book("Kuper",
                    "1890"
            )
        );

        new OrSearchCriteria(
                new AuthorSearchCriteria("Kuper"),
                new YearOfIssueSearchCriteria("1890")
        ).match(
                new Book("Kuper",
                        "1890"
                )
        );
    }
}
