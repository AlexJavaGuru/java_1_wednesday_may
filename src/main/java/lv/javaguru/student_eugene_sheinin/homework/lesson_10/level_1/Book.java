package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_1;

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book) {
            Book book = (Book) obj;
            return this.author.equals(book.getAuthor()) && this.title.equals(book.getTitle());
        }

        return super.equals(obj);
    }
}
