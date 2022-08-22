package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

class TitleSearchCriteria implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }


    @Override
    public boolean match(Book book) {
        return titleToSearch.contains(book.getTitle());
    }
}
