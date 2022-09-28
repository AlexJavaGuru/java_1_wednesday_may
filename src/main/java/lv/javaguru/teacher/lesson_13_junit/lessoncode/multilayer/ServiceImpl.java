package lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer;

import java.util.Optional;

public class ServiceImpl implements Service {

    private DataBase db;

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
