package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_31;

class Book {

    private String name;
    private String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return
                "name = '" + name + '\'' +
                ", author ='" + author + '\'';
    }
}
