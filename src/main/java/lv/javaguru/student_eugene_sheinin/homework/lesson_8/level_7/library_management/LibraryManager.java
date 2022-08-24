package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.library_management;

class LibraryManager {

    //library to operate
    private Library library;

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void getBookFromLibrary(Customer customer) {

    }

    public void returnBookToLibrary(Customer customer) {

    }

    public void findBookFromLibrary(String author, String title) {

    }

    public void noticeAboutExpiration() {
        //get all reservations form library, extract  and check  expiration dates, and notice if necessary
    }


    public void calculatePenaltyAndNoticeIfExpirationOverdue() {
        //get all reservations form library, extract  and check  expiration dates, and notice if necessary
    }

    public void addBookToLibrary(Book book) {

        //this.library.addBook(book);
    }

    private LibraryCard getCustomerLibraryCard(Customer customer) {

        return  null;
    }

    private boolean isBookReserved(Customer customer) {

        return  false;
    }
}
