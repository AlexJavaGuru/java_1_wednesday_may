package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

class LibraryDemo {
    public static void main(String[] args) {
        Library library = new BookReader();
        Book book1 = new Book("1","a");
        Book book2 = new Book("252 562","b");
        Book book3 = new Book("3","c");
        Book book4 = new Book("252 672","d");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        System.out.println(library.getBookList());
        System.out.println(library.findBooksByAuthor("252"));
    }
}
