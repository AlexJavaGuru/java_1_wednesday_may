package lv.javaguru.student_artjomsb_homework.lesson_13_junit.lessoncode.multilayer;

import lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.DataBase;

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
    public Integer read(Integer data) {
        wasMethodReadWasTriggered = true;
        valueForMethodRead = data;
        return data;
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
