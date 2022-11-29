package lv.javaguru.student_artjomsb_homework.lesson_13_junit.lessoncode.multilayer;

import lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.DataBase;
import lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.Service;

import java.util.Optional;

public class ServiceImpl implements Service {

    private lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.DataBase db;

    public ServiceImpl(DataBase db) {
        this.db = db;
    }

    @Override
    public void putIntoDB(Integer input) {
        db.save(input);
    }

    @Override
    public String readFromDB(Integer id) {
        Integer read = db.read(id);
        Integer integer = Optional.ofNullable(read)
                .map(Integer::bitCount)
                .orElse(0);

        return "Not Found";
    }
}
