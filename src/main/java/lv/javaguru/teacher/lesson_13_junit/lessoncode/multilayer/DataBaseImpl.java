package lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataBaseImpl implements DataBase {

    private List<Integer> database = new ArrayList<>();

    public void save(Integer data) {
        database.add(data);
    }

    public Integer read(Integer data) {
        for (Integer integer : database) {
            if (data.equals(integer)) {
                return integer;
            }
        }
        return null;
    }
}
