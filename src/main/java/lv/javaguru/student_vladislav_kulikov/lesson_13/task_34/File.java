package lv.javaguru.student_vladislav_kulikov.lesson_13.task_34;

class File {

    private String name;
    private int size;

    File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getSize() {
        return size;
    }

}