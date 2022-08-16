package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_8;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
