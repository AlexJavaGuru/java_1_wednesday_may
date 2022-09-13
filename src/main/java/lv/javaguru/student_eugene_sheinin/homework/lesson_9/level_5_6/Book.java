package lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_5_6;

public class Book {
    private String author;
    private String title;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book) {
              return this.author.equals(((Book) obj).author) &&
                      this.title.equals(((Book) obj).title);
        }

        return false;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
