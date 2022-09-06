package lv.javaguru.student_artjomsb_homework.lesson_13_junit.lessoncode.multilayer;

import lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.DataBase;

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
