package lv.javaguru.student_rodions_pismennijs.lesson_9.level_5;

class Demo {
    public static void main(String[] args) {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("Fire & Blood", "George R. R. Martin");
        subject.addBook(book1);

        Book book2 = new Book("Fire & Blood", "George R. R. Martin");
        Book book3 = new Book("The Winds of Winter", "George R. R. Martin");
        Book book4 = new Book("Fire & Blood", "George R. R. Martin");
        Book book5 = new Book("The Winds of Winter", "George R. R. Martin");
        subject.addBook(book2);
        subject.addBook(book3);
        subject.addBook(book4);
        subject.addBook(book5);
        System.out.println(subject.books.size());

        Book book6 = new Book("Harry Potter", null);
        subject.addBook(book6);

        System.out.println(subject.getAllBooks());

        System.out.println(subject.getBookByAuthor("George R. R. Martin"));


        subject.removeBook(book5);

        System.out.println(subject.getAllBooks());

        System.out.println(subject.getBookByAuthor("George "));

    }
}
