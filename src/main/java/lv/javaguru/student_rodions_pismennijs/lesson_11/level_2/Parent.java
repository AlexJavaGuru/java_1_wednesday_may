package lv.javaguru.student_rodions_pismennijs.lesson_11.level_2;

public class Parent {

    private String name;

    protected Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
