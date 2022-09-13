package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

class BookDatabaseImplDemo {
    public static void main(String[] args) {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        Book book4 = new Book("Author1", "Title4");
        Book book5 = new Book("Author1", "Title5");
        Book book6 = new Book("Author3", "Title6");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        database.save(book6);
        System.out.println(database.getBooks());
        System.out.println();
        System.out.println(database.getAuthorToBooksMap());
        System.out.println(database.getAuthorToBooksMap().entrySet());
        System.out.println(database.getAuthorToBooksMap().get("Author1"));
        System.out.println(database.getAuthorToBooksMap().get("Author1").size());
        System.out.println(database.getAuthorToBooksMap().keySet() + " keys");
        System.out.println(database.getAuthorToBooksMap().values() + " values");
        System.out.println(database.getEachAuthorBookCount());
    }
}
