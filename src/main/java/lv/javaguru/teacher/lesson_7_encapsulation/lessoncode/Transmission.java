package lv.javaguru.teacher.lesson_7_encapsulation.lessoncode;

import java.util.Objects;

public class Transmission {

    private boolean isAutomatic;
    private String name;

    public Transmission(boolean isAutomatic, String name) {
        this.isAutomatic = isAutomatic;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return isAutomatic == that.isAutomatic && Objects.equals(name, that.name);
    }
}
