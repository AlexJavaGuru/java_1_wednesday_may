package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

class AuthorSearchCriteria implements SearchCriteria{

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return authorToSearch.equals(book.getAuthor());
    }
}
