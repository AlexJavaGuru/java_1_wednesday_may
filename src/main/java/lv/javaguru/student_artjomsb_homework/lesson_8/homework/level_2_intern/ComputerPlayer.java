package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_2_intern;

class ComputerPlayer extends Player {
private String game;

    ComputerPlayer(String name, String game) {
        super(name);
        this.game = game;
    }

    @Override
    public String toString() {
        return "ComputerPlayer{" +
                "game='" + game + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
