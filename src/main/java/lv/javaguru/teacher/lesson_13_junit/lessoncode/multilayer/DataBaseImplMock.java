package lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer;

import javax.xml.crypto.Data;
import java.util.Optional;

public class DataBaseImplMock implements DataBase {

    public boolean wasMethodSaveWasTriggered;
    public Integer valueForMethodSave;

    public boolean wasMethodReadWasTriggered;
    public Integer valueForMethodRead;

    @Override
    public void save(Integer data) {
        wasMethodSaveWasTriggered = true;
        valueForMethodSave = data;
    }

    @Override
    public Optional<Integer> read(Integer data) {
        wasMethodReadWasTriggered = true;
        valueForMethodRead = data;
        return Optional.empty();
    }

    public boolean isWasMethodSaveWasTriggered() {
        return wasMethodSaveWasTriggered;
    }

    public Integer getValueForMethodSave() {
        return valueForMethodSave;
    }

    public boolean isWasMethodReadWasTriggered() {
        return wasMethodReadWasTriggered;
    }

    public Integer getValueForMethodRead() {
        return valueForMethodRead;
    }
}
