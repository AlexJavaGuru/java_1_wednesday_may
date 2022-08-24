package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_2_intern;


class Player {
    protected String name;

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
